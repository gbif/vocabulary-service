package org.gbif.vocabulary.app;

import org.gbif.vocabulary.grpc.Concept;
import org.gbif.vocabulary.grpc.VocabularyKey;
import org.gbif.vocabulary.grpc.VocabularyServiceGrpc;

import io.grpc.stub.StreamObserver;
import io.vertx.core.AbstractVerticle;
import io.vertx.core.Launcher;
import io.vertx.grpc.VertxServer;
import io.vertx.grpc.VertxServerBuilder;

public class Server extends AbstractVerticle {

    private VertxServer vertxServer;

    public static void main(String[] args) {
        Launcher.executeCommand("run",Server.class.getName());
    }

    @Override
    public void start() throws Exception {
        VocabularyServiceGrpc.VocabularyServiceImplBase service = new VocabularyServiceGrpc.VocabularyServiceImplBase() {
            @Override
            public void concepts(VocabularyKey request, StreamObserver<Concept> responseObserver) {
                responseObserver.onNext(Concept.newBuilder().setName("C1").build());
                responseObserver.onNext(Concept.newBuilder().setName("C2").build());
                responseObserver.onCompleted();
                super.concepts(request, responseObserver);
            }
        };

        vertxServer = VertxServerBuilder
                .forAddress(vertx, "localhost", 8080)
                .addService(service)
                .build();

        // Start is asynchronous
        vertxServer.start();
    }

    @Override
    public void stop() throws Exception {
        vertxServer.shutdown();
        super.stop();
    }
}
