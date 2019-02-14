package com.example.zzThriftServer;

import org.apache.thrift.TProcessorFactory;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.server.TNonblockingServer;
import org.apache.thrift.server.TServer;
import org.apache.thrift.transport.TFramedTransport;
import org.apache.thrift.transport.TNonblockingServerSocket;
import org.apache.thrift.transport.TTransportException;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.zzThriftProto.Hello;

@Component
public class HelloServiceServer implements CommandLineRunner  {
    /**
     * 启动 Thrift 服务器
     * @param args
     */
//    public void test() {
//    }

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

        try {
            TNonblockingServerSocket socket = new TNonblockingServerSocket(7911);
            Hello.Processor processor = new Hello.Processor(new HelloServiceImpl());
            TNonblockingServer.Args arg = new TNonblockingServer.Args(socket);
            arg.protocolFactory(new TBinaryProtocol.Factory());
            arg.transportFactory(new TFramedTransport.Factory());
            arg.processorFactory(new TProcessorFactory(processor));
            TServer server = new TNonblockingServer(arg);
            server.serve();
        } catch (TTransportException e) {
            e.printStackTrace();
        }
	}
}
