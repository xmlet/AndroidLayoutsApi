package org.xmlet.androidlayoutsapi;

public interface ViewAnimatorHierarchyInterface<T extends Element<T, Z>, Z extends Element> extends CustomAttributeGroup<T, Z>, TextGroup<T, Z>, FrameLayoutHierarchyInterface<T, Z> {
   default T attrAnimateFirstView(String attrAnimateFirstView) {
      this.getVisitor().visitAttributeAnimateFirstView(attrAnimateFirstView);
      return this.self();
   }

   default T attrInAnimation(String attrInAnimation) {
      this.getVisitor().visitAttributeInAnimation(attrInAnimation);
      return this.self();
   }

   default T attrOutAnimation(String attrOutAnimation) {
      this.getVisitor().visitAttributeOutAnimation(attrOutAnimation);
      return this.self();
   }
}
