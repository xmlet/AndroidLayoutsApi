package org.xmlet.androidlayoutsapi;

import java.util.function.Consumer;

public final class RelativeLayout<Z extends Element> implements CustomAttributeGroup<RelativeLayout<Z>, Z>, TextGroup<RelativeLayout<Z>, Z>, ViewGroupHierarchyInterface<RelativeLayout<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public RelativeLayout(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementRelativeLayout(this);
   }

   public RelativeLayout(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementRelativeLayout(this);
   }

   protected RelativeLayout(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementRelativeLayout(this);
      }

   }

   public Z __() {
      this.visitor.visitParentRelativeLayout(this);
      return this.parent;
   }

   public final RelativeLayout<Z> dynamic(Consumer<RelativeLayout<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final RelativeLayout<Z> of(Consumer<RelativeLayout<Z>> consumer) {
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
      return "relativeLayout";
   }

   public final RelativeLayout<Z> self() {
      return this;
   }

   public final RelativeLayout<Z> attrGravity(EnumGravityRelativeLayout attrGravity) {
      this.visitor.visitAttributeGravity(attrGravity.getValue());
      return this;
   }

   public final RelativeLayout<Z> attrIgnoreGravity(String attrIgnoreGravity) {
      this.visitor.visitAttributeIgnoreGravity(attrIgnoreGravity);
      return this;
   }
}
