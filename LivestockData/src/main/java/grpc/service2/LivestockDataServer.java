// MoistureServer.java

package grpc.service2;

import java.io.IOException;
import java.util.logging.Logger;

import grpc.service2.LivestockDataGrpc.LivestockDataImplBase;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

public class LivestockDataServer extends LivestockDataImplBase {

	private static final Logger logger = Logger.getLogger(LivestockDataServer.class.getName());

	public static void main(String[] args) throws InterruptedException, IOException {
		
		LivestockDataServer livestockdataserver = new LivestockDataServer();
		
		int port = 50053;
	    
		try {
			Server server = ServerBuilder.forPort(port)
			    .addService(livestockdataserver)
			    .build()
			    .start();
			
			System.out.println("Service2 started, listening on " + port);
			
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
	
	public void checkLivestockData(LivestockDataRequest request,  StreamObserver<LivestockDataReply> responseObserver) {
		    
		logger.info("Received checkLivestockData Request");
		 
		LivestockDataReply reply = LivestockDataReply.newBuilder().setMessage("300 cattle, 40 sheep, 10 pigs").build();
	     
		 responseObserver.onNext(reply);
	     
	     responseObserver.onCompleted();
	}

}
