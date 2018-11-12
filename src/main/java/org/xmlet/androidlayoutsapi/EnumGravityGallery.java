package org.xmlet.androidlayoutsapi;

import org.xmlet.xsdasmfaster.classes.infrastructure.EnumInterface;

public enum EnumGravityGallery implements EnumInterface<String> {
   BOTTOM(String.valueOf("bottom")),
   CENTER(String.valueOf("center")),
   CENTER_HORIZONTAL(String.valueOf("center_horizontal")),
   CENTER_VERTICAL(String.valueOf("center_vertical")),
   CLIP_HORIZONTAL(String.valueOf("clip_horizontal")),
   CLIP_VERTICAL(String.valueOf("clip_vertical")),
   FILL(String.valueOf("fill")),
   FILL_HORIZONTAL(String.valueOf("fill_horizontal")),
   FILL_VERTICAL(String.valueOf("fill_vertical")),
   LEFT(String.valueOf("left")),
   RIGHT(String.valueOf("right")),
   TOP(String.valueOf("top"));

   private final String value;

   private EnumGravityGallery(String var3) {
      this.value = var3;
   }

   public final String getValue() {
      return this.value;
   }
}
