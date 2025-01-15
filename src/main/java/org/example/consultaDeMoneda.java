package org.example;
import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class consultaDeMoneda {
    public Monedas buscarMonedas(String monedaBase, String moneda_target){
        URI direccionConsulta = URI.create("https://v6.exchangerate-api.com/v6/7cf558b3d2462a63d9b39d9a/pair/"+monedaBase+"/"+moneda_target);

        HttpClient cliente = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccionConsulta)
                .build();

        try {
            HttpResponse<String> response = cliente
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Monedas.class);
        }
        catch (Exception e){
            throw new RuntimeException("moneda no encontrada :(");
        }
    }
}
