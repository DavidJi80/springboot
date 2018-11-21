package com.github.davidji80.springboot.mahout.recommender;

import org.apache.mahout.cf.taste.common.TasteException;
import org.apache.mahout.cf.taste.impl.neighborhood.NearestNUserNeighborhood;
import org.apache.mahout.cf.taste.impl.recommender.CachingRecommender;
import org.apache.mahout.cf.taste.impl.recommender.GenericItemBasedRecommender;
import org.apache.mahout.cf.taste.impl.recommender.GenericUserBasedRecommender;
import org.apache.mahout.cf.taste.impl.similarity.EuclideanDistanceSimilarity;
import org.apache.mahout.cf.taste.impl.similarity.PearsonCorrelationSimilarity;
import org.apache.mahout.cf.taste.model.DataModel;
import org.apache.mahout.cf.taste.recommender.RecommendedItem;
import org.apache.mahout.cf.taste.recommender.Recommender;
import org.apache.mahout.cf.taste.similarity.ItemSimilarity;
import org.apache.mahout.cf.taste.similarity.UserSimilarity;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Component
public class MovieRecommender {
    final private int NEIGHBORHOOD_NUM = 10;
    @Resource(name = "fileDataModel")
    private DataModel dataModel;

    private List<Long> getRecommendedItemIDs(List<RecommendedItem> recommendations){
        List<Long> recommendItems = new ArrayList<>();
        for(int i = 0 ; i < recommendations.size() ; i++) {
            RecommendedItem recommendedItem=recommendations.get(i);
            recommendItems.add(recommendedItem.getItemID());
        }
        return recommendItems;
    }

    public List<Long> userBasedRecommender(long userID,int size) throws TasteException {
        UserSimilarity similarity  = new EuclideanDistanceSimilarity(dataModel );
        NearestNUserNeighborhood  neighbor = new NearestNUserNeighborhood(NEIGHBORHOOD_NUM, similarity, dataModel );
        Recommender recommender = new CachingRecommender(new GenericUserBasedRecommender(dataModel , neighbor, similarity));
        List<RecommendedItem> recommendations = recommender.recommend(userID, size);
        return getRecommendedItemIDs(recommendations);
    }

    public List<Long> itemBasedRecommender(long userID,int size) throws TasteException {
        List<Long> recommendItems = new ArrayList<>();
        ItemSimilarity itemSimilarity = new PearsonCorrelationSimilarity(dataModel);
        Recommender recommender = new GenericItemBasedRecommender(dataModel, itemSimilarity);
        List<RecommendedItem> recommendations = recommender.recommend(userID, size);
        return getRecommendedItemIDs(recommendations);
    }

}
