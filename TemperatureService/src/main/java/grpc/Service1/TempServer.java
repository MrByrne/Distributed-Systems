package grpc.Service1;


import java.io.IOException;
import java.util.ArrayList;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

public class TempServer extends grpc.Service1.TempServiceGrpc.TempServiceImplBase {

	public static void main(String[] args) {
		TempServer tempserver = new TempServer();

		int port = 50051;

		try {

			Server server = ServerBuilder.forPort(port)
					.addService(tempserver)
					.build()
					.start();

			System.out.println("Temperature Server started, listening on " + port);

			server.awaitTermination();


		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	public StreamObserver<NumberMessage> averageTemp(
			StreamObserver<CalculateResponse> responseObserver) {


		return new StreamObserver<NumberMessage>() {

			ArrayList<Float> list = new ArrayList<Float>();

			@Override
			public void onNext(NumberMessage request) {

				System.out.println("Temperature: "+ request.getNumber()  );

				list.add(request.getNumber());		           

			}

			@Override
			public void onError(Throwable t) {
				// TODO Auto-generated method stubal

			}

			@Override
			public void onCompleted() {
				System.out.printf("Receiving averageTemp method complete \n" );

				// System.out.println("mean "+ list.size());

				double temp = 0;	
				for(float v:  list) {
					temp = temp + v;
				}
				float mean = (float) (temp/list.size());

				CalculateResponse reply = CalculateResponse.newBuilder().setResult(mean).build();

				// System.out.println("mean "+ mean);
				responseObserver.onNext(reply);

				responseObserver.onCompleted();

			}

		};

	}

}
