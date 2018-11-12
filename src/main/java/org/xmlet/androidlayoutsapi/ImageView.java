package org.xmlet.androidlayoutsapi;

import java.util.function.Consumer;

public final class ImageView<Z extends Element> implements CustomAttributeGroup<ImageView<Z>, Z>, TextGroup<ImageView<Z>, Z>, ViewHierarchyInterface<ImageView<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public ImageView(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementImageView(this);
   }

   public ImageView(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementImageView(this);
   }

   protected ImageView(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementImageView(this);
      }

   }

   public Z __() {
      this.visitor.visitParentImageView(this);
      return this.parent;
   }

   public final ImageView<Z> dynamic(Consumer<ImageView<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final ImageView<Z> of(Consumer<ImageView<Z>> consumer) {
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
      return "imageView";
   }

   public final ImageView<Z> self() {
      return this;
   }

   public final ImageView<Z> attrAdjustViewBounds(String attrAdjustViewBounds) {
      this.visitor.visitAttributeAdjustViewBounds(attrAdjustViewBounds);
      return this;
   }

   public final ImageView<Z> attrBaseline(String attrBaseline) {
      this.visitor.visitAttributeBaseline(attrBaseline);
      return this;
   }

   public final ImageView<Z> attrBaselineAlignBottom(String attrBaselineAlignBottom) {
      this.visitor.visitAttributeBaselineAlignBottom(attrBaselineAlignBottom);
      return this;
   }

   public final ImageView<Z> attrCropToPadding(String attrCropToPadding) {
      this.visitor.visitAttributeCropToPadding(attrCropToPadding);
      return this;
   }

   public final ImageView<Z> attrMaxHeight(String attrMaxHeight) {
      this.visitor.visitAttributeMaxHeight(attrMaxHeight);
      return this;
   }

   public final ImageView<Z> attrMaxWidth(String attrMaxWidth) {
      this.visitor.visitAttributeMaxWidth(attrMaxWidth);
      return this;
   }

   public final ImageView<Z> attrScaleType(String attrScaleType) {
      this.visitor.visitAttributeScaleType(attrScaleType);
      return this;
   }

   public final ImageView<Z> attrSrc(String attrSrc) {
      this.visitor.visitAttributeSrc(attrSrc);
      return this;
   }

   public final ImageView<Z> attrTint(String attrTint) {
      this.visitor.visitAttributeTint(attrTint);
      return this;
   }
}
