package com.example.omnivisionapplication;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface MethodsOmniVision {
    @GET("chantier")
    Call<ModelOmniVision> getAllChantier();
    @POST("chantier")
    Call<ModelOmniVision> sendChantier();
}
