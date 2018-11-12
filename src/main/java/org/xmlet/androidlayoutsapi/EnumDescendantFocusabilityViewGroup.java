package org.xmlet.androidlayoutsapi;

import org.xmlet.xsdasmfaster.classes.infrastructure.EnumInterface;

public enum EnumDescendantFocusabilityViewGroup implements EnumInterface<String> {
   AFTERDESCENDANTS(String.valueOf("afterDescendants")),
   BEFOREDESCENDANTS(String.valueOf("beforeDescendants")),
   BLOCKSDESCENDANTS(String.valueOf("blocksDescendants"));

   private final String value;

   private EnumDescendantFocusabilityViewGroup(String var3) {
      this.value = var3;
   }

   public final String getValue() {
      return this.value;
   }
}
