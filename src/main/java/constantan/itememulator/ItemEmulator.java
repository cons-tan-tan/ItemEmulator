package constantan.itememulator;

import com.mojang.logging.LogUtils;
import net.minecraftforge.fml.common.Mod;
import org.slf4j.Logger;

@Mod("itememulator")
public class ItemEmulator {

    private static final Logger LOGGER = LogUtils.getLogger();

    public ItemEmulator() {
        LOGGER.info("ItemEmulator loaded");
    }
}
