package org.xmlet.androidlayoutsapi;

public interface FrameLayoutHierarchyInterface<T extends Element<T, Z>, Z extends Element> extends CustomAttributeGroup<T, Z>, TextGroup<T, Z>, ViewGroupHierarchyInterface<T, Z> {
   default T attrForeground(String attrForeground) {
      this.getVisitor().visitAttributeForeground(attrForeground);
      return this.self();
   }

   default T attrForegroundGravity(String attrForegroundGravity) {
      this.getVisitor().visitAttributeForegroundGravity(attrForegroundGravity);
      return this.self();
   }

   default T attrMeasureAllChildren(String attrMeasureAllChildren) {
      this.getVisitor().visitAttributeMeasureAllChildren(attrMeasureAllChildren);
      return this.self();
   }
}
