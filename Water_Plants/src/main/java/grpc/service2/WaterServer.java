package grpc.service2;


import java.io.IOException;
import grpc.service2.WaterServiceGrpc.WaterServiceImplBase;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

public class WaterServer extends WaterServiceImplBase {

	public static void main(String[] args) {
		WaterServer waterserver = new WaterServer();

		int port = 50051;

		try {

			Server server = ServerBuilder.forPort(port)
					.addService(waterserver)
					.build()
					.start();

			System.out.println("WaterPlants Server started, listening on " + port);

			server.awaitTermination();


		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void waterPlants(WaterRequest request,
			StreamObserver<WaterResponse> responseObserver) {


		System.out.printf("Receiving Plant ID",
				request.getNumbers() );
		
		for (int i = 0; i <= 100; i += 20) {
			int percentage = i;
			WaterResponse reply = WaterResponse.newBuilder().setNumber(percentage).build();
			responseObserver.onNext(reply);
		
			try {
				//wait for a second
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}


		responseObserver.onCompleted();


	}

}
