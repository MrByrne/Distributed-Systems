package grpc.service3;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import grpc.service3.FeedServiceGrpc.FeedServiceBlockingStub;
import grpc.service3.FeedServiceGrpc.FeedServiceStub;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;


public class FeedClient {

	private static FeedServiceBlockingStub blockingStub;
	private static FeedServiceStub asyncStub;


	public static void main(String[] args) {

		ManagedChannel channel = ManagedChannelBuilder
				.forAddress("localhost", 50054)
				.usePlaintext()
				.build();
		
		blockingStub = FeedServiceGrpc.newBlockingStub(channel);
		
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
		
		asyncStub = FeedServiceGrpc.newStub(channel);

		feedLivestock();

	}

	public static void feedLivestock() {

	    StreamObserver<FeedResponse> responseObserver = new StreamObserver<FeedResponse>() {
	        int count = 0;

	        public void onNext(FeedResponse msg) {
	            System.out.println("Feeding Station " + msg.getNumber() + " has been fed.");
	            count += 1;
	        }

	        public void onError(Throwable t) {
	            t.printStackTrace();

	        }

	        public void onCompleted() {
	            System.out.println("Stream is complete. All feeding stations are fed.");
	        }
	    };

	    StreamObserver<FeedMessage> requestObserver = asyncStub.feedLivestock(responseObserver);

	    try {

	        requestObserver.onNext(FeedMessage.newBuilder().setNumber(1).build());
	        Thread.sleep(new Random().nextInt(1000) + 500);

	        requestObserver.onNext(FeedMessage.newBuilder().setNumber(2).build());
	        Thread.sleep(new Random().nextInt(1000) + 500);

	        requestObserver.onNext(FeedMessage.newBuilder().setNumber(3).build());
	        Thread.sleep(new Random().nextInt(1000) + 500);

	        requestObserver.onNext(FeedMessage.newBuilder().setNumber(4).build());
	        Thread.sleep(new Random().nextInt(1000) + 500);

	        requestObserver.onNext(FeedMessage.newBuilder().setNumber(5).build());
	        Thread.sleep(new Random().nextInt(1000) + 500);

	        // Mark the end of requests
	        requestObserver.onCompleted();

	    } catch (RuntimeException e) {
	        e.printStackTrace();
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }

	    try {
	        Thread.sleep(1000);
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
	}




}
