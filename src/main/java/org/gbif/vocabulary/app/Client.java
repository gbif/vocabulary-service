package org.gbif.vocabulary.app;

import org.gbif.vocabulary.grpc.Concept;
import org.gbif.vocabulary.grpc.VocabularyKey;
import org.gbif.vocabulary.grpc.VocabularyServiceGrpc;

import io.grpc.ManagedChannel;
import io.grpc.stub.StreamObserver;
import io.vertx.core.Vertx;
import io.vertx.grpc.VertxChannelBuilder;

public class Client {

    public static void main(String[] args) {
        Vertx vertx = Vertx.factory.vertx();
        ManagedChannel channel = VertxChannelBuilder
                .forAddress(vertx, "localhost", 8080)
                .usePlaintext(true)
                .build();
        VocabularyServiceGrpc.VocabularyServiceStub stub = VocabularyServiceGrpc.newStub(channel);
        stub.concepts(VocabularyKey.newBuilder().setKey(1).build(), new StreamObserver<Concept>() {
            @Override
            public void onNext(Concept concept) {
                System.out.println(concept);
            }

            @Override
            public void onError(Throwable throwable) {
                System.out.println(throwable);
            }

            @Override
            public void onCompleted() {
                System.out.println("!!!");
            }
        });

    }
}
