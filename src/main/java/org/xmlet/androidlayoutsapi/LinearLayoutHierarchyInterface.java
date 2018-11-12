package org.xmlet.androidlayoutsapi;

public interface LinearLayoutHierarchyInterface<T extends Element<T, Z>, Z extends Element> extends CustomAttributeGroup<T, Z>, TextGroup<T, Z>, ViewGroupHierarchyInterface<T, Z> {
   default T attrBaselineAligned(Boolean attrBaselineAligned) {
      this.getVisitor().visitAttributeBaselineAligned(attrBaselineAligned.toString());
      return this.self();
   }

   default T attrBaselineAlignedChildIndex(String attrBaselineAlignedChildIndex) {
      this.getVisitor().visitAttributeBaselineAlignedChildIndex(attrBaselineAlignedChildIndex);
      return this.self();
   }

   default T attrDivider(String attrDivider) {
      this.getVisitor().visitAttributeDivider(attrDivider);
      return this.self();
   }

   default T attrDividerPadding(String attrDividerPadding) {
      this.getVisitor().visitAttributeDividerPadding(attrDividerPadding);
      return this.self();
   }

   default T attrGravity(EnumGravityLinearLayout attrGravity) {
      this.getVisitor().visitAttributeGravity(attrGravity.getValue());
      return this.self();
   }

   default T attrMeasureWithLargestChild(String attrMeasureWithLargestChild) {
      this.getVisitor().visitAttributeMeasureWithLargestChild(attrMeasureWithLargestChild);
      return this.self();
   }

   default T attrOrientation(EnumOrientationLinearLayout attrOrientation) {
      this.getVisitor().visitAttributeOrientation(attrOrientation.getValue());
      return this.self();
   }

   default T attrShowDividers(String attrShowDividers) {
      this.getVisitor().visitAttributeShowDividers(attrShowDividers);
      return this.self();
   }

   default T attrWeightSum(String attrWeightSum) {
      this.getVisitor().visitAttributeWeightSum(attrWeightSum);
      return this.self();
   }
}
