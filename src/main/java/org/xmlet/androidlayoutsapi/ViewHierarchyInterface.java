package org.xmlet.androidlayoutsapi;

public interface ViewHierarchyInterface<T extends Element<T, Z>, Z extends Element> extends CustomAttributeGroup<T, Z>, TextGroup<T, Z> {
   default T attrLayoutX(String attrLayoutX) {
      this.getVisitor().visitAttributeLayoutX(attrLayoutX);
      return this.self();
   }

   default T attrLayoutY(String attrLayoutY) {
      this.getVisitor().visitAttributeLayoutY(attrLayoutY);
      return this.self();
   }

   default T attrLayoutGravity(EnumLayoutGravityView attrLayoutGravity) {
      this.getVisitor().visitAttributeLayoutGravity(attrLayoutGravity.getValue());
      return this.self();
   }

   default T attrLayoutColumn(String attrLayoutColumn) {
      this.getVisitor().visitAttributeLayoutColumn(attrLayoutColumn);
      return this.self();
   }

   default T attrLayoutColumnSpan(String attrLayoutColumnSpan) {
      this.getVisitor().visitAttributeLayoutColumnSpan(attrLayoutColumnSpan);
      return this.self();
   }

   default T attrLayoutRow(String attrLayoutRow) {
      this.getVisitor().visitAttributeLayoutRow(attrLayoutRow);
      return this.self();
   }

   default T attrLayoutRowSpan(String attrLayoutRowSpan) {
      this.getVisitor().visitAttributeLayoutRowSpan(attrLayoutRowSpan);
      return this.self();
   }

   default T attrIcon(String attrIcon) {
      this.getVisitor().visitAttributeIcon(attrIcon);
      return this.self();
   }

   default T attrImeSubtypeExtraValue(String attrImeSubtypeExtraValue) {
      this.getVisitor().visitAttributeImeSubtypeExtraValue(attrImeSubtypeExtraValue);
      return this.self();
   }

   default T attrImeSubtypeLocale(String attrImeSubtypeLocale) {
      this.getVisitor().visitAttributeImeSubtypeLocale(attrImeSubtypeLocale);
      return this.self();
   }

   default T attrImeSubtypeMode(String attrImeSubtypeMode) {
      this.getVisitor().visitAttributeImeSubtypeMode(attrImeSubtypeMode);
      return this.self();
   }

   default T attrIsAuxiliary(String attrIsAuxiliary) {
      this.getVisitor().visitAttributeIsAuxiliary(attrIsAuxiliary);
      return this.self();
   }

   default T attrLabel(String attrLabel) {
      this.getVisitor().visitAttributeLabel(attrLabel);
      return this.self();
   }

   default T attrOverridesImplicitlyEnabledSubtype(String attrOverridesImplicitlyEnabledSubtype) {
      this.getVisitor().visitAttributeOverridesImplicitlyEnabledSubtype(attrOverridesImplicitlyEnabledSubtype);
      return this.self();
   }

   default T attrCodes(String attrCodes) {
      this.getVisitor().visitAttributeCodes(attrCodes);
      return this.self();
   }

   default T attrIconPreview(String attrIconPreview) {
      this.getVisitor().visitAttributeIconPreview(attrIconPreview);
      return this.self();
   }

   default T attrIsModifier(String attrIsModifier) {
      this.getVisitor().visitAttributeIsModifier(attrIsModifier);
      return this.self();
   }

   default T attrIsRepeatable(String attrIsRepeatable) {
      this.getVisitor().visitAttributeIsRepeatable(attrIsRepeatable);
      return this.self();
   }

   default T attrIsSticky(String attrIsSticky) {
      this.getVisitor().visitAttributeIsSticky(attrIsSticky);
      return this.self();
   }

   default T attrKeyEdgeFlags(String attrKeyEdgeFlags) {
      this.getVisitor().visitAttributeKeyEdgeFlags(attrKeyEdgeFlags);
      return this.self();
   }

   default T attrKeyIcon(String attrKeyIcon) {
      this.getVisitor().visitAttributeKeyIcon(attrKeyIcon);
      return this.self();
   }

   default T attrKeyLabel(String attrKeyLabel) {
      this.getVisitor().visitAttributeKeyLabel(attrKeyLabel);
      return this.self();
   }

   default T attrKeyOutputText(String attrKeyOutputText) {
      this.getVisitor().visitAttributeKeyOutputText(attrKeyOutputText);
      return this.self();
   }

   default T attrKeyboardMode(String attrKeyboardMode) {
      this.getVisitor().visitAttributeKeyboardMode(attrKeyboardMode);
      return this.self();
   }

   default T attrPopupCharacters(String attrPopupCharacters) {
      this.getVisitor().visitAttributePopupCharacters(attrPopupCharacters);
      return this.self();
   }

   default T attrPopupKeyboard(String attrPopupKeyboard) {
      this.getVisitor().visitAttributePopupKeyboard(attrPopupKeyboard);
      return this.self();
   }

   default T attrRowEdgeFlags(String attrRowEdgeFlags) {
      this.getVisitor().visitAttributeRowEdgeFlags(attrRowEdgeFlags);
      return this.self();
   }

   default T attrLayoutHeight(String attrLayoutHeight) {
      this.getVisitor().visitAttributeLayoutHeight(attrLayoutHeight);
      return this.self();
   }

   default T attrLayoutWeight(String attrLayoutWeight) {
      this.getVisitor().visitAttributeLayoutWeight(attrLayoutWeight);
      return this.self();
   }

   default T attrLayoutWidth(String attrLayoutWidth) {
      this.getVisitor().visitAttributeLayoutWidth(attrLayoutWidth);
      return this.self();
   }

   default T attrLayoutAbove(String attrLayoutAbove) {
      this.getVisitor().visitAttributeLayoutAbove(attrLayoutAbove);
      return this.self();
   }

   default T attrLayoutAlignBaseline(String attrLayoutAlignBaseline) {
      this.getVisitor().visitAttributeLayoutAlignBaseline(attrLayoutAlignBaseline);
      return this.self();
   }

   default T attrLayoutAlignBottom(String attrLayoutAlignBottom) {
      this.getVisitor().visitAttributeLayoutAlignBottom(attrLayoutAlignBottom);
      return this.self();
   }

   default T attrLayoutAlignLeft(String attrLayoutAlignLeft) {
      this.getVisitor().visitAttributeLayoutAlignLeft(attrLayoutAlignLeft);
      return this.self();
   }

   default T attrLayoutAlignParentBottom(String attrLayoutAlignParentBottom) {
      this.getVisitor().visitAttributeLayoutAlignParentBottom(attrLayoutAlignParentBottom);
      return this.self();
   }

   default T attrLayoutAlignParentLeft(String attrLayoutAlignParentLeft) {
      this.getVisitor().visitAttributeLayoutAlignParentLeft(attrLayoutAlignParentLeft);
      return this.self();
   }

   default T attrLayoutAlignParentRight(String attrLayoutAlignParentRight) {
      this.getVisitor().visitAttributeLayoutAlignParentRight(attrLayoutAlignParentRight);
      return this.self();
   }

   default T attrLayoutAlignParentTop(String attrLayoutAlignParentTop) {
      this.getVisitor().visitAttributeLayoutAlignParentTop(attrLayoutAlignParentTop);
      return this.self();
   }

   default T attrLayoutAlignRight(String attrLayoutAlignRight) {
      this.getVisitor().visitAttributeLayoutAlignRight(attrLayoutAlignRight);
      return this.self();
   }

   default T attrLayoutAlignTop(String attrLayoutAlignTop) {
      this.getVisitor().visitAttributeLayoutAlignTop(attrLayoutAlignTop);
      return this.self();
   }

   default T attrLayoutAlignWithParentIfMissing(String attrLayoutAlignWithParentIfMissing) {
      this.getVisitor().visitAttributeLayoutAlignWithParentIfMissing(attrLayoutAlignWithParentIfMissing);
      return this.self();
   }

   default T attrLayoutBelow(String attrLayoutBelow) {
      this.getVisitor().visitAttributeLayoutBelow(attrLayoutBelow);
      return this.self();
   }

   default T attrLayoutCenterHorizontal(String attrLayoutCenterHorizontal) {
      this.getVisitor().visitAttributeLayoutCenterHorizontal(attrLayoutCenterHorizontal);
      return this.self();
   }

   default T attrLayoutCenterInParent(String attrLayoutCenterInParent) {
      this.getVisitor().visitAttributeLayoutCenterInParent(attrLayoutCenterInParent);
      return this.self();
   }

   default T attrLayoutCenterVertical(String attrLayoutCenterVertical) {
      this.getVisitor().visitAttributeLayoutCenterVertical(attrLayoutCenterVertical);
      return this.self();
   }

   default T attrLayoutToLeftOf(String attrLayoutToLeftOf) {
      this.getVisitor().visitAttributeLayoutToLeftOf(attrLayoutToLeftOf);
      return this.self();
   }

   default T attrLayoutToRightOf(String attrLayoutToRightOf) {
      this.getVisitor().visitAttributeLayoutToRightOf(attrLayoutToRightOf);
      return this.self();
   }

   default T attrSubtypeExtraValue(String attrSubtypeExtraValue) {
      this.getVisitor().visitAttributeSubtypeExtraValue(attrSubtypeExtraValue);
      return this.self();
   }

   default T attrSubtypeLocale(String attrSubtypeLocale) {
      this.getVisitor().visitAttributeSubtypeLocale(attrSubtypeLocale);
      return this.self();
   }

   default T attrLayoutSpan(String attrLayoutSpan) {
      this.getVisitor().visitAttributeLayoutSpan(attrLayoutSpan);
      return this.self();
   }

   default T attrLayoutScale(String attrLayoutScale) {
      this.getVisitor().visitAttributeLayoutScale(attrLayoutScale);
      return this.self();
   }

   default T attrAlpha(String attrAlpha) {
      this.getVisitor().visitAttributeAlpha(attrAlpha);
      return this.self();
   }

   default T attrBackground(String attrBackground) {
      this.getVisitor().visitAttributeBackground(attrBackground);
      return this.self();
   }

   default T attrClickable(Boolean attrClickable) {
      this.getVisitor().visitAttributeClickable(attrClickable.toString());
      return this.self();
   }

   default T attrContentDescription(String attrContentDescription) {
      this.getVisitor().visitAttributeContentDescription(attrContentDescription);
      return this.self();
   }

   default T attrDrawingCacheQuality(EnumDrawingCacheQualityView attrDrawingCacheQuality) {
      this.getVisitor().visitAttributeDrawingCacheQuality(attrDrawingCacheQuality.getValue());
      return this.self();
   }

   default T attrDuplicateParentState(Boolean attrDuplicateParentState) {
      this.getVisitor().visitAttributeDuplicateParentState(attrDuplicateParentState.toString());
      return this.self();
   }

   default T attrFadeScrollbars(Boolean attrFadeScrollbars) {
      this.getVisitor().visitAttributeFadeScrollbars(attrFadeScrollbars.toString());
      return this.self();
   }

   default T attrFadingEdge(EnumFadingEdgeView attrFadingEdge) {
      this.getVisitor().visitAttributeFadingEdge(attrFadingEdge.getValue());
      return this.self();
   }

   default T attrFadingEdgeLength(String attrFadingEdgeLength) {
      this.getVisitor().visitAttributeFadingEdgeLength(attrFadingEdgeLength);
      return this.self();
   }

   default T attrFilterTouchesWhenObscured(String attrFilterTouchesWhenObscured) {
      this.getVisitor().visitAttributeFilterTouchesWhenObscured(attrFilterTouchesWhenObscured);
      return this.self();
   }

   default T attrFitsSystemWindows(Boolean attrFitsSystemWindows) {
      this.getVisitor().visitAttributeFitsSystemWindows(attrFitsSystemWindows.toString());
      return this.self();
   }

   default T attrFocusable(Boolean attrFocusable) {
      this.getVisitor().visitAttributeFocusable(attrFocusable.toString());
      return this.self();
   }

   default T attrFocusableInTouchMode(Boolean attrFocusableInTouchMode) {
      this.getVisitor().visitAttributeFocusableInTouchMode(attrFocusableInTouchMode.toString());
      return this.self();
   }

   default T attrHapticFeedbackEnabled(Boolean attrHapticFeedbackEnabled) {
      this.getVisitor().visitAttributeHapticFeedbackEnabled(attrHapticFeedbackEnabled.toString());
      return this.self();
   }

   default T attrId(String attrId) {
      this.getVisitor().visitAttributeId(attrId);
      return this.self();
   }

   default T attrIsScrollContainer(Boolean attrIsScrollContainer) {
      this.getVisitor().visitAttributeIsScrollContainer(attrIsScrollContainer.toString());
      return this.self();
   }

   default T attrKeepScreenOn(Boolean attrKeepScreenOn) {
      this.getVisitor().visitAttributeKeepScreenOn(attrKeepScreenOn.toString());
      return this.self();
   }

   default T attrLayerType(String attrLayerType) {
      this.getVisitor().visitAttributeLayerType(attrLayerType);
      return this.self();
   }

   default T attrLongClickable(Boolean attrLongClickable) {
      this.getVisitor().visitAttributeLongClickable(attrLongClickable.toString());
      return this.self();
   }

   default T attrNextFocusDown(String attrNextFocusDown) {
      this.getVisitor().visitAttributeNextFocusDown(attrNextFocusDown);
      return this.self();
   }

   default T attrNextFocusForward(String attrNextFocusForward) {
      this.getVisitor().visitAttributeNextFocusForward(attrNextFocusForward);
      return this.self();
   }

   default T attrNextFocusLeft(String attrNextFocusLeft) {
      this.getVisitor().visitAttributeNextFocusLeft(attrNextFocusLeft);
      return this.self();
   }

   default T attrNextFocusRight(String attrNextFocusRight) {
      this.getVisitor().visitAttributeNextFocusRight(attrNextFocusRight);
      return this.self();
   }

   default T attrNextFocusUp(String attrNextFocusUp) {
      this.getVisitor().visitAttributeNextFocusUp(attrNextFocusUp);
      return this.self();
   }

   default T attrOnClick(String attrOnClick) {
      this.getVisitor().visitAttributeOnClick(attrOnClick);
      return this.self();
   }

   default T attrOverScrollMode(String attrOverScrollMode) {
      this.getVisitor().visitAttributeOverScrollMode(attrOverScrollMode);
      return this.self();
   }

   default T attrPadding(String attrPadding) {
      this.getVisitor().visitAttributePadding(attrPadding);
      return this.self();
   }

   default T attrPaddingBottom(String attrPaddingBottom) {
      this.getVisitor().visitAttributePaddingBottom(attrPaddingBottom);
      return this.self();
   }

   default T attrPaddingLeft(String attrPaddingLeft) {
      this.getVisitor().visitAttributePaddingLeft(attrPaddingLeft);
      return this.self();
   }

   default T attrPaddingRight(String attrPaddingRight) {
      this.getVisitor().visitAttributePaddingRight(attrPaddingRight);
      return this.self();
   }

   default T attrPaddingTop(String attrPaddingTop) {
      this.getVisitor().visitAttributePaddingTop(attrPaddingTop);
      return this.self();
   }

   default T attrRequiresFadingEdge(String attrRequiresFadingEdge) {
      this.getVisitor().visitAttributeRequiresFadingEdge(attrRequiresFadingEdge);
      return this.self();
   }

   default T attrRotation(String attrRotation) {
      this.getVisitor().visitAttributeRotation(attrRotation);
      return this.self();
   }

   default T attrRotationX(String attrRotationX) {
      this.getVisitor().visitAttributeRotationX(attrRotationX);
      return this.self();
   }

   default T attrRotationY(String attrRotationY) {
      this.getVisitor().visitAttributeRotationY(attrRotationY);
      return this.self();
   }

   default T attrSaveEnabled(Boolean attrSaveEnabled) {
      this.getVisitor().visitAttributeSaveEnabled(attrSaveEnabled.toString());
      return this.self();
   }

   default T attrScaleX(String attrScaleX) {
      this.getVisitor().visitAttributeScaleX(attrScaleX);
      return this.self();
   }

   default T attrScaleY(String attrScaleY) {
      this.getVisitor().visitAttributeScaleY(attrScaleY);
      return this.self();
   }

   default T attrScrollX(String attrScrollX) {
      this.getVisitor().visitAttributeScrollX(attrScrollX);
      return this.self();
   }

   default T attrScrollY(String attrScrollY) {
      this.getVisitor().visitAttributeScrollY(attrScrollY);
      return this.self();
   }

   default T attrScrollbarAlwaysDrawHorizontalTrack(Boolean attrScrollbarAlwaysDrawHorizontalTrack) {
      this.getVisitor().visitAttributeScrollbarAlwaysDrawHorizontalTrack(attrScrollbarAlwaysDrawHorizontalTrack.toString());
      return this.self();
   }

   default T attrScrollbarAlwaysDrawVerticalTrack(Boolean attrScrollbarAlwaysDrawVerticalTrack) {
      this.getVisitor().visitAttributeScrollbarAlwaysDrawVerticalTrack(attrScrollbarAlwaysDrawVerticalTrack.toString());
      return this.self();
   }

   default T attrScrollbarDefaultDelayBeforeFade(String attrScrollbarDefaultDelayBeforeFade) {
      this.getVisitor().visitAttributeScrollbarDefaultDelayBeforeFade(attrScrollbarDefaultDelayBeforeFade);
      return this.self();
   }

   default T attrScrollbarFadeDuration(String attrScrollbarFadeDuration) {
      this.getVisitor().visitAttributeScrollbarFadeDuration(attrScrollbarFadeDuration);
      return this.self();
   }

   default T attrScrollbarSize(String attrScrollbarSize) {
      this.getVisitor().visitAttributeScrollbarSize(attrScrollbarSize);
      return this.self();
   }

   default T attrScrollbarStyle(EnumScrollbarStyleView attrScrollbarStyle) {
      this.getVisitor().visitAttributeScrollbarStyle(attrScrollbarStyle.getValue());
      return this.self();
   }

   default T attrScrollbarThumbHorizontal(String attrScrollbarThumbHorizontal) {
      this.getVisitor().visitAttributeScrollbarThumbHorizontal(attrScrollbarThumbHorizontal);
      return this.self();
   }

   default T attrScrollbarThumbVertical(String attrScrollbarThumbVertical) {
      this.getVisitor().visitAttributeScrollbarThumbVertical(attrScrollbarThumbVertical);
      return this.self();
   }

   default T attrScrollbarTrackHorizontal(String attrScrollbarTrackHorizontal) {
      this.getVisitor().visitAttributeScrollbarTrackHorizontal(attrScrollbarTrackHorizontal);
      return this.self();
   }

   default T attrScrollbarTrackVertical(String attrScrollbarTrackVertical) {
      this.getVisitor().visitAttributeScrollbarTrackVertical(attrScrollbarTrackVertical);
      return this.self();
   }

   default T attrScrollbars(EnumScrollbarsView attrScrollbars) {
      this.getVisitor().visitAttributeScrollbars(attrScrollbars.getValue());
      return this.self();
   }

   default T attrSoundEffectsEnabled(Boolean attrSoundEffectsEnabled) {
      this.getVisitor().visitAttributeSoundEffectsEnabled(attrSoundEffectsEnabled.toString());
      return this.self();
   }

   default T attrTag(String attrTag) {
      this.getVisitor().visitAttributeTag(attrTag);
      return this.self();
   }

   default T attrTransformPivotX(String attrTransformPivotX) {
      this.getVisitor().visitAttributeTransformPivotX(attrTransformPivotX);
      return this.self();
   }

   default T attrTransformPivotY(String attrTransformPivotY) {
      this.getVisitor().visitAttributeTransformPivotY(attrTransformPivotY);
      return this.self();
   }

   default T attrTranslationX(String attrTranslationX) {
      this.getVisitor().visitAttributeTranslationX(attrTranslationX);
      return this.self();
   }

   default T attrTranslationY(String attrTranslationY) {
      this.getVisitor().visitAttributeTranslationY(attrTranslationY);
      return this.self();
   }

   default T attrVerticalScrollbarPosition(String attrVerticalScrollbarPosition) {
      this.getVisitor().visitAttributeVerticalScrollbarPosition(attrVerticalScrollbarPosition);
      return this.self();
   }

   default T attrVisibility(EnumVisibilityView attrVisibility) {
      this.getVisitor().visitAttributeVisibility(attrVisibility.getValue());
      return this.self();
   }

   default T attrLayoutMargin(String attrLayoutMargin) {
      this.getVisitor().visitAttributeLayoutMargin(attrLayoutMargin);
      return this.self();
   }

   default T attrLayoutMarginBottom(String attrLayoutMarginBottom) {
      this.getVisitor().visitAttributeLayoutMarginBottom(attrLayoutMarginBottom);
      return this.self();
   }

   default T attrLayoutMarginLeft(String attrLayoutMarginLeft) {
      this.getVisitor().visitAttributeLayoutMarginLeft(attrLayoutMarginLeft);
      return this.self();
   }

   default T attrLayoutMarginRight(String attrLayoutMarginRight) {
      this.getVisitor().visitAttributeLayoutMarginRight(attrLayoutMarginRight);
      return this.self();
   }

   default T attrLayoutMarginTop(String attrLayoutMarginTop) {
      this.getVisitor().visitAttributeLayoutMarginTop(attrLayoutMarginTop);
      return this.self();
   }
}
