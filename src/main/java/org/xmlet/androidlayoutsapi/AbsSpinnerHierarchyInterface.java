package org.xmlet.androidlayoutsapi;

public interface AbsSpinnerHierarchyInterface<T extends Element<T, Z>, Z extends Element> extends CustomAttributeGroup<T, Z>, TextGroup<T, Z>, AdapterViewHierarchyInterface<T, Z> {
   default T attrEntries(String attrEntries) {
      this.getVisitor().visitAttributeEntries(attrEntries);
      return this.self();
   }
}
