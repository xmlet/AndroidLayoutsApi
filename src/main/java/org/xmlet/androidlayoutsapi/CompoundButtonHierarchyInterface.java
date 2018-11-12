package org.xmlet.androidlayoutsapi;

public interface CompoundButtonHierarchyInterface<T extends Element<T, Z>, Z extends Element> extends CustomAttributeGroup<T, Z>, TextGroup<T, Z>, ButtonHierarchyInterface<T, Z> {
   default T attrButton(String attrButton) {
      this.getVisitor().visitAttributeButton(attrButton);
      return this.self();
   }

   default T attrChecked(String attrChecked) {
      this.getVisitor().visitAttributeChecked(attrChecked);
      return this.self();
   }
}
