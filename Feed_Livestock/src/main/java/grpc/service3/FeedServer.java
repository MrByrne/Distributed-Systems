package grpc.service3;


import io.grpc.stub.StreamObserver;

import java.io.IOException;
import grpc.service3.FeedServiceGrpc.FeedServiceImplBase;

import io.grpc.Server;
import io.grpc.ServerBuilder;

public class FeedServer extends FeedServiceImplBase {

    public static void main(String[] args) {
        FeedServer feedserver = new FeedServer();

        int port = 50054;

        try {
            Server server = ServerBuilder.forPort(port)
                    .addService(feedserver)
                    .build()
                    .start();

            System.out.println("Feed Livestock Server started, listening on " + port);

            server.awaitTermination();

        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // Restore the interrupted status
            e.printStackTrace();
        }
    }

    @Override
    public StreamObserver<FeedMessage> feedLivestock(final StreamObserver<FeedResponse> responseObserver) {

        return new StreamObserver<FeedMessage>() {

            @Override
            public void onNext(FeedMessage msg) {
                System.out.println("Feeding Livestock at Station: " + msg.getNumber() + " is complete.");

                //int station = msg.getNumber();

                FeedResponse reply = FeedResponse.newBuilder().setNumber(msg.getNumber()).build();

                responseObserver.onNext(reply);

            }

            @Override
            public void onError(Throwable t) {
                t.printStackTrace();
            }

            @Override
            public void onCompleted() {
                System.out.println("All Feeding Stations are complete. ");

                // completed too
                responseObserver.onCompleted();
            }

        };
    }
}

