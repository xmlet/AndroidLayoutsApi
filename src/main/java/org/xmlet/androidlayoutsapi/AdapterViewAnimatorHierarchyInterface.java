package org.xmlet.androidlayoutsapi;

public interface AdapterViewAnimatorHierarchyInterface<T extends Element<T, Z>, Z extends Element> extends CustomAttributeGroup<T, Z>, TextGroup<T, Z>, AdapterViewHierarchyInterface<T, Z> {
   default T attrAnimateFirstView(String attrAnimateFirstView) {
      this.getVisitor().visitAttributeAnimateFirstView(attrAnimateFirstView);
      return this.self();
   }

   default T attrInAnimation(String attrInAnimation) {
      this.getVisitor().visitAttributeInAnimation(attrInAnimation);
      return this.self();
   }

   default T attrLoopViews(String attrLoopViews) {
      this.getVisitor().visitAttributeLoopViews(attrLoopViews);
      return this.self();
   }

   default T attrOutAnimation(String attrOutAnimation) {
      this.getVisitor().visitAttributeOutAnimation(attrOutAnimation);
      return this.self();
   }
}
