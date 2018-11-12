package org.xmlet.androidlayoutsapi;

public interface AutoCompleteTextViewHierarchyInterface<T extends Element<T, Z>, Z extends Element> extends CustomAttributeGroup<T, Z>, TextGroup<T, Z>, EditTextHierarchyInterface<T, Z> {
   default T attrCompletionHint(String attrCompletionHint) {
      this.getVisitor().visitAttributeCompletionHint(attrCompletionHint);
      return this.self();
   }

   default T attrCompletionHintView(String attrCompletionHintView) {
      this.getVisitor().visitAttributeCompletionHintView(attrCompletionHintView);
      return this.self();
   }

   default T attrCompletionThreshold(String attrCompletionThreshold) {
      this.getVisitor().visitAttributeCompletionThreshold(attrCompletionThreshold);
      return this.self();
   }

   default T attrDropDownAnchor(String attrDropDownAnchor) {
      this.getVisitor().visitAttributeDropDownAnchor(attrDropDownAnchor);
      return this.self();
   }

   default T attrDropDownHeight(String attrDropDownHeight) {
      this.getVisitor().visitAttributeDropDownHeight(attrDropDownHeight);
      return this.self();
   }

   default T attrDropDownHorizontalOffset(String attrDropDownHorizontalOffset) {
      this.getVisitor().visitAttributeDropDownHorizontalOffset(attrDropDownHorizontalOffset);
      return this.self();
   }

   default T attrDropDownSelector(String attrDropDownSelector) {
      this.getVisitor().visitAttributeDropDownSelector(attrDropDownSelector);
      return this.self();
   }

   default T attrDropDownVerticalOffset(String attrDropDownVerticalOffset) {
      this.getVisitor().visitAttributeDropDownVerticalOffset(attrDropDownVerticalOffset);
      return this.self();
   }

   default T attrDropDownWidth(String attrDropDownWidth) {
      this.getVisitor().visitAttributeDropDownWidth(attrDropDownWidth);
      return this.self();
   }

   default T attrInputType(String attrInputType) {
      this.getVisitor().visitAttributeInputType(attrInputType);
      return this.self();
   }
}
