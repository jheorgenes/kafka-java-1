package br.com.alura.ecommerce;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.apache.kafka.common.serialization.Serializer;

/* Definindo a serialização de forma que o kafka entenda o JSON*/
public class GsonSerializer<T> implements Serializer<T> {

    /* Serializador de GSON*/
    private final Gson gson = new GsonBuilder().create();

    @Override
    public byte[] serialize(String s, T object) {
        /* Faz a conversão do objeto para JSON e depois transforma em bytes */
        return gson.toJson(object).getBytes();
    }
}
