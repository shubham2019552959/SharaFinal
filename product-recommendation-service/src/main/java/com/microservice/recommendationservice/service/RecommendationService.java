package com.microservice.recommendationservice.service;

import java.util.List;

import com.microservice.recommendationservice.model.Recommendation;

public interface RecommendationService {
	Recommendation getRecommendationById(Long recommendationId);
    Recommendation saveRecommendation(Recommendation recommendation);
    List<Recommendation> getAllRecommendationByProductName(String productName);
    void deleteRecommendation(Long id);
}
