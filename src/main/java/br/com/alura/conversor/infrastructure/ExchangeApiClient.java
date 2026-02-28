package br.com.alura.conversor.infrastructure;

import br.com.alura.conversor.domain.Currency;
import br.com.alura.conversor.domain.ExchangeResponse;
import br.com.alura.conversor.service.ExchangeService;
import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ExchangeApiClient implements ExchangeService {

    @Override
    public ExchangeResponse getExchange(Currency base, Currency target) {
        HttpClient client = HttpClient.newHttpClient();
        try {
            Gson gson = new Gson();

            StringBuilder builder = new StringBuilder();
            builder.append("https://v6.exchangerate-api.com/v6/0b8fbc5d59601a7ba04d1989/pair/");
            builder.append(base.name());
            builder.append("/");
            builder.append(target.name());

            URI url = URI.create(builder.toString());

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(url)
                    .GET()
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            return gson.fromJson(response.body(), ExchangeResponse.class);

        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
