package fireopal.commoncherry;

import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CommonCherry implements ModInitializer {
    public static final String MODID = "commoncherry";
    public static final Logger LOGGER = LoggerFactory.getLogger(MODID);

    @Override
    public void onInitialize() {

    }

    public static Identifier id(String id) {
        return new Identifier(MODID, id);
    }
}