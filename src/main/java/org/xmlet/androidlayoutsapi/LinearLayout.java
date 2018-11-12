package org.xmlet.androidlayoutsapi;

import java.util.function.Consumer;

public final class LinearLayout<Z extends Element> implements CustomAttributeGroup<LinearLayout<Z>, Z>, TextGroup<LinearLayout<Z>, Z>, ViewGroupHierarchyInterface<LinearLayout<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public LinearLayout(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementLinearLayout(this);
   }

   public LinearLayout(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementLinearLayout(this);
   }

   protected LinearLayout(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementLinearLayout(this);
      }

   }

   public Z __() {
      this.visitor.visitParentLinearLayout(this);
      return this.parent;
   }

   public final LinearLayout<Z> dynamic(Consumer<LinearLayout<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final LinearLayout<Z> of(Consumer<LinearLayout<Z>> consumer) {
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
      return "linearLayout";
   }

   public final LinearLayout<Z> self() {
      return this;
   }

   public final LinearLayout<Z> attrBaselineAligned(Boolean attrBaselineAligned) {
      this.visitor.visitAttributeBaselineAligned(attrBaselineAligned.toString());
      return this;
   }

   public final LinearLayout<Z> attrBaselineAlignedChildIndex(String attrBaselineAlignedChildIndex) {
      this.visitor.visitAttributeBaselineAlignedChildIndex(attrBaselineAlignedChildIndex);
      return this;
   }

   public final LinearLayout<Z> attrDivider(String attrDivider) {
      this.visitor.visitAttributeDivider(attrDivider);
      return this;
   }

   public final LinearLayout<Z> attrDividerPadding(String attrDividerPadding) {
      this.visitor.visitAttributeDividerPadding(attrDividerPadding);
      return this;
   }

   public final LinearLayout<Z> attrGravity(EnumGravityLinearLayout attrGravity) {
      this.visitor.visitAttributeGravity(attrGravity.getValue());
      return this;
   }

   public final LinearLayout<Z> attrMeasureWithLargestChild(String attrMeasureWithLargestChild) {
      this.visitor.visitAttributeMeasureWithLargestChild(attrMeasureWithLargestChild);
      return this;
   }

   public final LinearLayout<Z> attrOrientation(EnumOrientationLinearLayout attrOrientation) {
      this.visitor.visitAttributeOrientation(attrOrientation.getValue());
      return this;
   }

   public final LinearLayout<Z> attrShowDividers(String attrShowDividers) {
      this.visitor.visitAttributeShowDividers(attrShowDividers);
      return this;
   }

   public final LinearLayout<Z> attrWeightSum(String attrWeightSum) {
      this.visitor.visitAttributeWeightSum(attrWeightSum);
      return this;
   }
}
