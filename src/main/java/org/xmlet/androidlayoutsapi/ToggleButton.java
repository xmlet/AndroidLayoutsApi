package org.xmlet.androidlayoutsapi;

import java.util.function.Consumer;

public final class ToggleButton<Z extends Element> implements CustomAttributeGroup<ToggleButton<Z>, Z>, TextGroup<ToggleButton<Z>, Z>, CompoundButtonHierarchyInterface<ToggleButton<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public ToggleButton(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementToggleButton(this);
   }

   public ToggleButton(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementToggleButton(this);
   }

   protected ToggleButton(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementToggleButton(this);
      }

   }

   public Z __() {
      this.visitor.visitParentToggleButton(this);
      return this.parent;
   }

   public final ToggleButton<Z> dynamic(Consumer<ToggleButton<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final ToggleButton<Z> of(Consumer<ToggleButton<Z>> consumer) {
      consumer.accept(this);
      return this;
   }

   public Z getParent() {
      return this.parent;
   }

   public final ElementVisitor getVisitor() {
      return this.visitor;
   }

   public String getName() {
      return "toggleButton";
   }

   public final ToggleButton<Z> self() {
      return this;
   }

   public final ToggleButton<Z> attrDisabledAlpha(String attrDisabledAlpha) {
      this.visitor.visitAttributeDisabledAlpha(attrDisabledAlpha);
      return this;
   }

   public final ToggleButton<Z> attrTextOff(String attrTextOff) {
      this.visitor.visitAttributeTextOff(attrTextOff);
      return this;
   }

   public final ToggleButton<Z> attrTextOn(String attrTextOn) {
      this.visitor.visitAttributeTextOn(attrTextOn);
      return this;
   }
}
