// WeatherServer.java

package grpc.service1;

import java.io.IOException;
import java.util.logging.Logger;

import grpc.service1.WeatherGrpc.WeatherImplBase;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

public class WeatherServer extends WeatherImplBase {

	private static final Logger logger = Logger.getLogger(WeatherServer.class.getName());

	public static void main(String[] args) throws InterruptedException, IOException {
		
		WeatherServer weatherserver = new WeatherServer();
		
		int port = 50051;
	    
		try {
			Server server = ServerBuilder.forPort(port)
			    .addService(weatherserver)
			    .build()
			    .start();
			
			System.out.println("Service1 started, listening on " + port);
			
			server.awaitTermination();

			 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	    logger.info("Server started, listening on " + port);
	    		    
	   
	}
	
	public void checkWeather(WeatherRequest request,  StreamObserver<WeatherReply> responseObserver) {
		    
		logger.info("Received checkWeather Request");
		 
		 WeatherReply reply = WeatherReply.newBuilder().setMessage("Cloudy with a chance of rain.").build();
	     
		 responseObserver.onNext(reply);
	     
	     responseObserver.onCompleted();
	}
	

}
