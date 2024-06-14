package exchangerate;//import java.io.IOException;
//import java.io.InputStream;
//import java.io.InputStreamReader;
//import java.net.HttpURLConnection;
//import java.net.URL;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import com.google.gson.annotations.SerializedName;

public class Extractor {

    @SerializedName("base_code")
    private String baseCode;

    @SerializedName("target_code")
    private String targetCode;

    @SerializedName("conversion_rate")
    private float conversionRate;

    @SerializedName("conversion_result")
    private float conversionResult;

    // Default constructor
    public Extractor() {
    }

    // Parameterized constructor
    public Extractor(String baseCode, String targetCode, float conversionRate, float conversionResult) {
        this.baseCode = baseCode;
        this.targetCode = targetCode;
        this.conversionRate = conversionRate;
        this.conversionResult = conversionResult;
    }

    // Getters
    public String getBaseCode() {
        return baseCode;
    }

    public String getTargetCode() {
        return targetCode;
    }

    public float getConversionRate() {
        return conversionRate;
    }

    public float getConversionResult() {
        return conversionResult;
    }
}