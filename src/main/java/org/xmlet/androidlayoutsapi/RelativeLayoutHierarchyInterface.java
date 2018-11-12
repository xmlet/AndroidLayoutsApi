package org.xmlet.androidlayoutsapi;

public interface RelativeLayoutHierarchyInterface<T extends Element<T, Z>, Z extends Element> extends CustomAttributeGroup<T, Z>, TextGroup<T, Z>, ViewGroupHierarchyInterface<T, Z> {
   default T attrGravity(EnumGravityRelativeLayout attrGravity) {
      this.getVisitor().visitAttributeGravity(attrGravity.getValue());
      return this.self();
   }

   default T attrIgnoreGravity(String attrIgnoreGravity) {
      this.getVisitor().visitAttributeIgnoreGravity(attrIgnoreGravity);
      return this.self();
   }
}
