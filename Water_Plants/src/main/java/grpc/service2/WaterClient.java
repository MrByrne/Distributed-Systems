package grpc.service2;

import java.util.concurrent.TimeUnit;

import grpc.service2.WaterServiceGrpc.WaterServiceBlockingStub;
import grpc.service2.WaterServiceGrpc.WaterServiceStub;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;


public class WaterClient {

	private static WaterServiceBlockingStub blockingStub;
	private static WaterServiceStub asyncStub;


	public static void main(String[] args) {

		ManagedChannel channel = ManagedChannelBuilder
				.forAddress("localhost", 50051)
				.usePlaintext()
				.build();

		blockingStub = WaterServiceGrpc.newBlockingStub(channel);
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

		asyncStub = WaterServiceGrpc.newStub(channel);
				
		waterPlants();

	}

	public static void waterPlants() {

		WaterRequest request = WaterRequest.newBuilder()
				.setNumbers(10).build();


		StreamObserver<WaterResponse> responseObserver = new StreamObserver<WaterResponse>() {

			int count =0 ;

			@Override
			public void onNext(WaterResponse value) {
				System.out.println("Plant is watered: " + value.getNumber() + "%");
			}

			@Override
			public void onError(Throwable t) {
				t.printStackTrace();

			}

			@Override
			public void onCompleted() {
				System.out.println("Watering Plan is Complete.");
			}

		};

		asyncStub.waterPlants(request, responseObserver);

		try {
			Thread.sleep(15000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
