// MoistureServer.java

package grpc.service3;

import java.io.IOException;
import java.util.logging.Logger;

import grpc.service3.MoistureGrpc.MoistureImplBase;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

public class MoistureServer extends MoistureImplBase {

	private static final Logger logger = Logger.getLogger(MoistureServer.class.getName());

	public static void main(String[] args) throws InterruptedException, IOException {
		
		MoistureServer moistureserver = new MoistureServer();
		
		int port = 50053;
	    
		try {
			Server server = ServerBuilder.forPort(port)
			    .addService(moistureserver)
			    .build()
			    .start();
			
			System.out.println("Service3 started, listening on " + port);
			
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
	
	public void checkMoisture(MoistureRequest request,  StreamObserver<MoistureReply> responseObserver) {
		    
		logger.info("Received checkMoisture Request");
		 
		MoistureReply reply = MoistureReply.newBuilder().setMessage("Soil moisture levels are currently 20%").build();
	     
		 responseObserver.onNext(reply);
	     
	     responseObserver.onCompleted();
	}

}
