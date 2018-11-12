package org.xmlet.androidlayoutsapi;

public interface ProgressBarHierarchyInterface<T extends Element<T, Z>, Z extends Element> extends CustomAttributeGroup<T, Z>, TextGroup<T, Z>, ViewHierarchyInterface<T, Z> {
   default T attrAnimationResolution(String attrAnimationResolution) {
      this.getVisitor().visitAttributeAnimationResolution(attrAnimationResolution);
      return this.self();
   }

   default T attrIndeterminate(String attrIndeterminate) {
      this.getVisitor().visitAttributeIndeterminate(attrIndeterminate);
      return this.self();
   }

   default T attrIndeterminateBehavior(String attrIndeterminateBehavior) {
      this.getVisitor().visitAttributeIndeterminateBehavior(attrIndeterminateBehavior);
      return this.self();
   }

   default T attrIndeterminateDrawable(String attrIndeterminateDrawable) {
      this.getVisitor().visitAttributeIndeterminateDrawable(attrIndeterminateDrawable);
      return this.self();
   }

   default T attrIndeterminateDuration(String attrIndeterminateDuration) {
      this.getVisitor().visitAttributeIndeterminateDuration(attrIndeterminateDuration);
      return this.self();
   }

   default T attrIndeterminateOnly(String attrIndeterminateOnly) {
      this.getVisitor().visitAttributeIndeterminateOnly(attrIndeterminateOnly);
      return this.self();
   }

   default T attrInterpolator(String attrInterpolator) {
      this.getVisitor().visitAttributeInterpolator(attrInterpolator);
      return this.self();
   }

   default T attrMax(String attrMax) {
      this.getVisitor().visitAttributeMax(attrMax);
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

   default T attrMinHeight(String attrMinHeight) {
      this.getVisitor().visitAttributeMinHeight(attrMinHeight);
      return this.self();
   }

   default T attrMinWidth(String attrMinWidth) {
      this.getVisitor().visitAttributeMinWidth(attrMinWidth);
      return this.self();
   }

   default T attrProgress(String attrProgress) {
      this.getVisitor().visitAttributeProgress(attrProgress);
      return this.self();
   }

   default T attrProgressDrawable(String attrProgressDrawable) {
      this.getVisitor().visitAttributeProgressDrawable(attrProgressDrawable);
      return this.self();
   }

   default T attrSecondaryProgress(String attrSecondaryProgress) {
      this.getVisitor().visitAttributeSecondaryProgress(attrSecondaryProgress);
      return this.self();
   }
}
