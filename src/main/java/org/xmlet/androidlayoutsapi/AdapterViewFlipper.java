package org.xmlet.androidlayoutsapi;

import java.util.function.Consumer;

public final class AdapterViewFlipper<Z extends Element> implements CustomAttributeGroup<AdapterViewFlipper<Z>, Z>, TextGroup<AdapterViewFlipper<Z>, Z>, AdapterViewAnimatorHierarchyInterface<AdapterViewFlipper<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public AdapterViewFlipper(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementAdapterViewFlipper(this);
   }

   public AdapterViewFlipper(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementAdapterViewFlipper(this);
   }

   protected AdapterViewFlipper(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementAdapterViewFlipper(this);
      }

   }

   public Z __() {
      this.visitor.visitParentAdapterViewFlipper(this);
      return this.parent;
   }

   public final AdapterViewFlipper<Z> dynamic(Consumer<AdapterViewFlipper<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final AdapterViewFlipper<Z> of(Consumer<AdapterViewFlipper<Z>> consumer) {
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
      return "adapterViewFlipper";
   }

   public final AdapterViewFlipper<Z> self() {
      return this;
   }

   public final AdapterViewFlipper<Z> attrAutoStart(String attrAutoStart) {
      this.visitor.visitAttributeAutoStart(attrAutoStart);
      return this;
   }

   public final AdapterViewFlipper<Z> attrFlipInterval(String attrFlipInterval) {
      this.visitor.visitAttributeFlipInterval(attrFlipInterval);
      return this;
   }
}
