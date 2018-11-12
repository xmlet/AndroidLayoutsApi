package org.xmlet.androidlayoutsapi;

public interface ImageViewHierarchyInterface<T extends Element<T, Z>, Z extends Element> extends CustomAttributeGroup<T, Z>, TextGroup<T, Z>, ViewHierarchyInterface<T, Z> {
   default T attrAdjustViewBounds(String attrAdjustViewBounds) {
      this.getVisitor().visitAttributeAdjustViewBounds(attrAdjustViewBounds);
      return this.self();
   }

   default T attrBaseline(String attrBaseline) {
      this.getVisitor().visitAttributeBaseline(attrBaseline);
      return this.self();
   }

   default T attrBaselineAlignBottom(String attrBaselineAlignBottom) {
      this.getVisitor().visitAttributeBaselineAlignBottom(attrBaselineAlignBottom);
      return this.self();
   }

   default T attrCropToPadding(String attrCropToPadding) {
      this.getVisitor().visitAttributeCropToPadding(attrCropToPadding);
      return this.self();
   }

   default T attrMaxHeight(String attrMaxHeight) {
      this.getVisitor().visitAttributeMaxHeight(attrMaxHeight);
      return this.self();
   }

   default T attrMaxWidth(String attrMaxWidth) {
      this.getVisitor().visitAttributeMaxWidth(attrMaxWidth);
      return this.self();
   }

   default T attrScaleType(String attrScaleType) {
      this.getVisitor().visitAttributeScaleType(attrScaleType);
      return this.self();
   }

   default T attrSrc(String attrSrc) {
      this.getVisitor().visitAttributeSrc(attrSrc);
      return this.self();
   }

   default T attrTint(String attrTint) {
      this.getVisitor().visitAttributeTint(attrTint);
      return this.self();
   }
}
