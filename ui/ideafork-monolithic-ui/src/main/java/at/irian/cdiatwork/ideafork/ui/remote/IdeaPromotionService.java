package at.irian.cdiatwork.ideafork.ui.remote;

import at.irian.cdiatwork.ideafork.remote.api.ResourceClient;
import at.irian.cdiatwork.ideafork.remote.api.TypedCollection;
import at.irian.cdiatwork.ideafork.ui.remote.dto.Idea;
import at.irian.cdiatwork.ideafork.ui.remote.dto.PromotionRequest;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import java.util.List;

@ResourceClient(name = "promotions", version = "v1")
public interface IdeaPromotionService {
    @POST
    @Path("/requests")
    void requestIdeaPromotion(PromotionRequest promotionRequest);

    @GET
    @TypedCollection(PromotionRequest.class)
    @Path("/requests")
    List<PromotionRequest> loadRecentIdeaPromotions(String searchHint);

    @POST
    void promoteIdea(PromotionRequest selectedPromotionRequest);

    @GET
    @TypedCollection(Idea.class)
    List<Idea> loadRecentlyPromotedIdeas();
}
