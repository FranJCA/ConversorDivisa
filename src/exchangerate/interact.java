package exchangerate;

import com.google.gson.*;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;

public class interact {
    public static ArrayList<String> historial = new ArrayList<>();

    // Bloque estático para inicializar el ArrayList
    static {
        historial = new ArrayList<>();
        historial.add("Registro de tiempo");
    }
   private String key ="13d06e51620ae68b6a1d5f24";
  private   HttpClient client = HttpClient.newHttpClient();

   public void ejecutor(String moneda1, String moneda2, int monto) throws IOException, InterruptedException {

       String base = moneda1;
       String targ = moneda2;
       int divisa = monto;
       String direccion = String.format("https://v6.exchangerate-api.com/v6/%s/pair/%s/%s/%d", key, base, targ, divisa);

       HttpRequest request = HttpRequest.newBuilder()
               .uri(URI.create(direccion))
               .build();

       HttpResponse<String> response = client
               .send(request, HttpResponse.BodyHandlers.ofString());

       String ysi= response.body();
       Gson gson = new Gson();
       Extractor test = gson.fromJson(ysi, Extractor.class);

       System.out.println("El valor de "+divisa +" " +base + " --> "+targ +" es de " +String.format("%.4f", test.getConversionResult()));
       historial.add("El valor de "+divisa +" " +base + " --> "+targ +" es de " +  test.getConversionResult());


   }

    public ArrayList<String> his(){
       return historial;
    }

}
