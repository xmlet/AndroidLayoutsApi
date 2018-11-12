package org.xmlet.androidlayoutsapi;

public interface ListViewHierarchyInterface<T extends Element<T, Z>, Z extends Element> extends CustomAttributeGroup<T, Z>, TextGroup<T, Z>, AbsListViewHierarchyInterface<T, Z> {
   default T attrDivider(String attrDivider) {
      this.getVisitor().visitAttributeDivider(attrDivider);
      return this.self();
   }

   default T attrDividerHeight(String attrDividerHeight) {
      this.getVisitor().visitAttributeDividerHeight(attrDividerHeight);
      return this.self();
   }

   default T attrEntries(String attrEntries) {
      this.getVisitor().visitAttributeEntries(attrEntries);
      return this.self();
   }

   default T attrFooterDividersEnabled(String attrFooterDividersEnabled) {
      this.getVisitor().visitAttributeFooterDividersEnabled(attrFooterDividersEnabled);
      return this.self();
   }

   default T attrHeaderDividersEnabled(String attrHeaderDividersEnabled) {
      this.getVisitor().visitAttributeHeaderDividersEnabled(attrHeaderDividersEnabled);
      return this.self();
   }

   default T attrOverScrollFooter(String attrOverScrollFooter) {
      this.getVisitor().visitAttributeOverScrollFooter(attrOverScrollFooter);
      return this.self();
   }

   default T attrOverScrollHeader(String attrOverScrollHeader) {
      this.getVisitor().visitAttributeOverScrollHeader(attrOverScrollHeader);
      return this.self();
   }
}
