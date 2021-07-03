package com.tottiandraristiano.responsi.service;

import com.tottiandraristiano.responsi.model.kasus.KasusResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface KasusRepository {
    @GET("rekapitulasi_v2/jabar/harian")
    Call<KasusResponse> getKasusResponse();
}