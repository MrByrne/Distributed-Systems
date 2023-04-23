// TempClient.java

package grpc.Service1;

import java.util.concurrent.TimeUnit;

import grpc.Service1.TempServiceGrpc.TempServiceBlockingStub;
import grpc.Service1.TempServiceGrpc.TempServiceStub;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;


public class TempClient {

	private static TempServiceBlockingStub blockingStub;
	private static TempServiceStub asyncStub;


	public static void main(String[] args) {

		ManagedChannel channel = ManagedChannelBuilder
				.forAddress("localhost", 50051)
				.usePlaintext()
				.build();

		blockingStub = TempServiceGrpc.newBlockingStub(channel);
		//Timeout
		Runtime.getRuntime().addShutdownHook(new Thread() {

			@Override
			public void run() {
				try {
					channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

			}

		});

		asyncStub = TempServiceGrpc.newStub(channel);
				
		averageTemp();

	}

	public static void averageTemp() {

		StreamObserver<CalculateResponse> responseObserver = new StreamObserver<CalculateResponse>() {

			@Override
			public void onNext(CalculateResponse msg) {
				System.out.println("The averge temperature is " + msg.getResult() + " degrees celcius");
			}

			@Override
			public void onError(Throwable t) {
				t.printStackTrace();
			}

			@Override
			public void onCompleted() {
				System.out.println("Service stream is complete.");
			}

		};


		StreamObserver<NumberMessage> requestObserver = asyncStub.averageTemp(responseObserver);
		try {
			requestObserver.onNext(NumberMessage.newBuilder().setNumber(28.3f).build());
			Thread.sleep(500);

			requestObserver.onNext(NumberMessage.newBuilder().setNumber(27).build());
			Thread.sleep(500);

			requestObserver.onNext(NumberMessage.newBuilder().setNumber(29.5f).build());
			Thread.sleep(500);

			requestObserver.onNext(NumberMessage.newBuilder().setNumber(28).build());
			Thread.sleep(500);

			requestObserver.onNext(NumberMessage.newBuilder().setNumber(28.6f).build());
			Thread.sleep(500);


			// Mark the end of requests
			requestObserver.onCompleted();

			
			Thread.sleep(10000);
			
		} catch (RuntimeException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {			
			e.printStackTrace();
		}


	}	

}
