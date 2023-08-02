package fireopal.commoncherry.gen;

import terrablender.api.Regions;
import terrablender.api.TerraBlenderApi;

public class CommonCherryTerraBlenderEntrypoint implements TerraBlenderApi {
    @Override
    public void onTerraBlenderInitialized() {
        Regions.register(new CommonCherryRegions.CherryRegion());
        Regions.register(new CommonCherryRegions.TaigaRegion());
    }
}
