# Play With Mind - Earn Rewards (Android)
This is the demo Android project with:
- Firebase Phone OTP login (mobile number + OTP)
- AdMob integration placeholders (use your live IDs)
- Loyalty / streak / referral / leaderboard / watch & earn logic points prepared
- Sudoku game placeholder
- Wallet + UPI withdrawal stubbed

## 🚀 फिचर्स (Features)
- Mobile OTP authentication via Firebase  
- Level-based reward sharing: default 10%, 3-level streak 15%, 5+ streak 20%  
- Referral system (inviter & invitee bonus)  
- Leaderboard weekly bonus  
- Streak reset on failure  
- Watch & Earn (video ad reward)  
- AdMob (Interstitial, Rewarded, Banner) integration points  
- UPI withdrawal UI placeholder  

## 🛠️ लोकल बिल्ड कसं करायचं (Build locally)

1. ZIP अनझिप करून Android Studio मध्ये प्रोजेक्ट **Open** करा (root folder: `PlayWithMindApp`).
2. SDK Manager मध्ये Android API Level 33 इंस्टॉल करा.
3. Firebase Console मध्ये:
   - Phone Sign-in method enable करा.
   - Test phone number सेट करा (development साठी) to bypass real SMS.
4. AdMob initialize करण्यासाठी `MainActivity` मध्ये (placeholder):
   ```kotlin
   MobileAds.initialize(this) {}
