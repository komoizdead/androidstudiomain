# Bengali Kindergarten Learning App Implementation Plan

This plan outlines the steps to transform the current project into a vibrant Bengali learning app for children. The app will focus on alphabets, numbers, and basic concepts with a kid-friendly UI.

## User Review Required

> [!IMPORTANT]
> - **Navigation**: I'll implement a simple screen switching logic. Should I use standard Jetpack Navigation or a simpler state-based approach for this initial phase?
> - **Assets**: A kids' app relies heavily on images. I'll use placeholders or Material Icons for now. Please let me know if you have specific icons or images you'd like to use.

## Proposed Changes

### Core Infrastructure

#### [MODIFY] [MainActivity.kt](file:///C:/Users/DFIT/AndroidStudioProjects/MyApplication/app/src/main/java/com/example/myapplication/MainActivity.kt)
- Update `MainActivity` to host the main navigation and high-level UI structure.

#### [NEW] [HomeViewModel.kt](file:///C:/Users/DFIT/AndroidStudioProjects/MyApplication/app/src/main/java/com/example/myapplication/ui/HomeViewModel.kt)
- Manage the app state (current category, content list).

### UI Components

#### [NEW] [HomeScreen.kt](file:///C:/Users/DFIT/AndroidStudioProjects/MyApplication/app/src/main/java/com/example/myapplication/ui/HomeScreen.kt)
- A colorful dashboard with buttons for "স্বরবর্ণ" (Alphabets), "সংখ্যা" (Numbers), and "রঙ" (Colors).

#### [NEW] [AlphabetScreen.kt](file:///C:/Users/DFIT/AndroidStudioProjects/MyApplication/app/src/main/java/com/example/myapplication/ui/AlphabetScreen.kt)
- Grid view of Bengali vowels (Swarabarna) with clear, large text.

#### [NEW] [NumberScreen.kt](file:///C:/Users/DFIT/AndroidStudioProjects/MyApplication/app/src/main/java/com/example/myapplication/ui/NumberScreen.kt)
- Grid view of Bengali numbers (১-১০).

### Localization & Resources

#### [NEW] [strings.xml (bn)](file:///C:/Users/DFIT/AndroidStudioProjects/MyApplication/app/src/main/res/values-bn/strings.xml)
- Bengali translations for all UI labels.

#### [MODIFY] [strings.xml](file:///C:/Users/DFIT/AndroidStudioProjects/MyApplication/app/src/main/res/values/strings.xml)
- English base strings for fallback.

## Verification Plan

### Automated Tests
- I'll create basic UI tests to verify that clicking a category button navigates to the correct screen.

### Manual Verification
- Deploy to the emulator/device.
- Verify that Bengali characters are rendered correctly.
- Check if the UI is responsive and child-friendly (large buttons, high contrast).
