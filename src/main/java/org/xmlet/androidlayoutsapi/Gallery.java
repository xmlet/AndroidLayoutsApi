package org.xmlet.androidlayoutsapi;

import java.util.function.Consumer;

public final class Gallery<Z extends Element> implements CustomAttributeGroup<Gallery<Z>, Z>, TextGroup<Gallery<Z>, Z>, AbsSpinnerHierarchyInterface<Gallery<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public Gallery(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementGallery(this);
   }

   public Gallery(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementGallery(this);
   }

   protected Gallery(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementGallery(this);
      }

   }

   public Z __() {
      this.visitor.visitParentGallery(this);
      return this.parent;
   }

   public final Gallery<Z> dynamic(Consumer<Gallery<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final Gallery<Z> of(Consumer<Gallery<Z>> consumer) {
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
      return "gallery";
   }

   public final Gallery<Z> self() {
      return this;
   }

   public final Gallery<Z> attrAnimationDuration(String attrAnimationDuration) {
      this.visitor.visitAttributeAnimationDuration(attrAnimationDuration);
      return this;
   }

   public final Gallery<Z> attrGravity(EnumGravityGallery attrGravity) {
      this.visitor.visitAttributeGravity(attrGravity.getValue());
      return this;
   }

   public final Gallery<Z> attrSpacing(String attrSpacing) {
      this.visitor.visitAttributeSpacing(attrSpacing);
      return this;
   }

   public final Gallery<Z> attrUnselectedAlpha(String attrUnselectedAlpha) {
      this.visitor.visitAttributeUnselectedAlpha(attrUnselectedAlpha);
      return this;
   }
}
