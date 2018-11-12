package org.xmlet.androidlayoutsapi;

import org.xmlet.xsdasmfaster.classes.infrastructure.EnumInterface;

public enum EnumDrawingCacheQualityView implements EnumInterface<String> {
   AUTO(String.valueOf("auto")),
   HIGH(String.valueOf("high")),
   LOW(String.valueOf("low"));

   private final String value;

   private EnumDrawingCacheQualityView(String var3) {
      this.value = var3;
   }

   public final String getValue() {
      return this.value;
   }
}
