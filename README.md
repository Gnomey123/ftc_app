

<<<<<<< HEAD
<div align="center">
    <img src="https://i.imgur.com/bMAmxfZ.png" width="100%"/>
    <br></br>
  <p>
    <a href="https://discord.gg/colton"><img src="https://discordapp.com/api/guilds/345404637374971907/embed.png" alt="Discord server" /></a>
  </p>
  <b>Developed by Alex Carter of Disnode Robotics and Levi Gershon of Newton's Law</b>
    <br/>
     <i>Version 2018.2 | Updated 10/08/2018 </i>

</div>

# DogeCV
A easy to use computer vision library used for FTC Games to detect game objects. Based on Ender CV and OpenCV. 

## Project Status:
**IN DEVELOPMENT. CURRENTLY IN ALPHA. NOT COMPETITION READY**

# DISCLAIMER
### THIS REPO IS STILL UNDER HEAVY DEVELOPMENT. WE WILL BE ADDING FURTHER DOCUMENTATION, BUG FIXES AND NEW DETECTORS SOON.
Also please keep in mind due to the major rewrite, many components have not been fully tested and polished, and many Relic Recovery detectors may be broken.

## Videos
Wizards.exe have been amazing with their DogeCV coverage, so please check them out and give your support, the videos are easy to understand and well made, great for peopling who want to learn DogeCV.

Official Tutorials coming with the 2018.3 Update. (Est Sep 20th)
 - [Wizards.exe Tutorial](https://www.youtube.com/watch?v=_i-EU3v9CRc)


## Development Team
- Alex Carter FTC 7195 Mechanical Memes
- Levi Gershon FTC 12897 Newton's Law of Mass'
- Brandon FTC 8565 Technicbots

## Other Contributors
- Karter FTC 5975 Cybots (Brainstorming for Jewel Detector)
- Derek FTC 5484 Enderbots (EnderCV Classes)
- Owen Gonzalez (Testing)
- Kwon Paradigm Break (Testing)

## Known Issues
(These issues are referring to the 2018-2019 FTC Year Detectors, and not the Relic Recovery ones as those are no longer supported)
- General Instablity
- GenericDetector not ported
- Vuforia is rotated in portrait mode
- RoverRukas Package typo.

## Planned Features / TODO
- Fix Vuforia
- Add in distance scoring between samples to increase accuracy
- General Code Clean up
- Update Wiki
- Basic angle/positioning of elements
- Example Autons using DogeCV
- Port Old detectors to new systems
- Better Safety checks
- Move to our own OpenCV System
- Add to JCenter
- New Frame Input System
- ML detectors


## Install (Credit to EnderCV)
1. Download this repo, either by cloning from Git or using the zip download. 
2. Pull up Android Studio, with the FTC application SDK open
3. Navigate to **File** -> **New** -> **Import Module** from the title bar.
4. When the a dialog comes up, asking for the module source directory, navigate to this repo and select the **openCVLibrary3** folder, and then hit **Finish**
5. Repeat steps 3 and 4 except instead of selecting the **openCVLibrary3** folder, select the **DogeCV** folder instead. If Android Studio fails to import modules because it sucks sometimes, open `settings.gradle` and add these two lines: 
```
include ':openCVLibrary3'
include ':DogeCV'
```
and resync the project.    
6. In the left hand side project explorer in Android Studio, right-click **TeamCode**, and click on **Open Module Settings**.    
7. A **Project Structure** dialog should come up. Click the **Dependencies** tab.     
8. Click the green plus sign on the right hand side, then **Module dependency**, and then **:openCVLibrary3**, then press OK.     
9. Repeat step 8, except substitute **:openCVLibrary3** with **:DogeCV**.   
10. Click **OK** to exit the **Project Structure** dialog.    


# Detectors Status
- **Gold Align Detector** - Implemented. Unstable (Memory Leak)
- **Sampling Detector** - Implemented. Stable. Not Competition Ready.
- **Gold Detector** - Implemented Base (Needs more).Stable. Not Competition Ready.
- **Silver Detector** - Implemented Base (Needs more).Stable. Not Competition Ready.
- **MultiMineral Detector** - Not Yet Implemented
**See Wiki For More Info

## FAQ
- **If I use dogeCV can I still use Vuforia?**
    With the 2018 edition of DogeCV we have enabled the option to use Vuforia and DogeCV at the same time, while using the same camera and viewing both data on the RC at the same time! This is done by using DogeCV's Vuforia class `DogeForia`. See more in the wiki.
    (Current Unstable)
- **Can I still use classic OpenCV?**
    Yes! We want teams to use DogeCV to learn about vision and start to create their own vision systems. That's why OpenCV is open in all layers of DogeCV, and we keep the classic OpenCVPipepline introduced in the EnderCV lib.
- **`Dogeforia` is getting import errors:**
    This is a current bug that I am investigating, for right now simply move the Dogeforia class to your `TeamCode` package.


## Changelogs
**2018.2**:
 - Added `HoughSilverDetector`: intended for slighter slower but more precise silver mineral classification. Works nicely.
 - Added JavaDocs and in-depths comments on most detectors, scorers, and filters
 - Changed `DogeCVScorer` input from MatOfPoint to Mat in order to facilitate more diverse scoring methods
 - Detectors now have a seperate `displayMat` as opposed to a `workingMat`; one is for detection work, the other is for displaying the results
 - Added `SilverExample` OpMode for demonstrating silver detector use
 - Added `HoughSilverExample` OpMode for demonstrating Hough transform-based silver detector use
 - Gold Align Detector now has `setAlignSettings(int offset, int width)` function to set parameters
 - Updated `SamplingOrderDetector` to choose top two silver minerals instead of all
 - Ported `GenericDetector` to using `DogeCVDetector`
 - Ported `BlankDetector` to using `DogeCVDetector`
 - Added `updateSettings` to `LeviColorFilter`
 - Corrected typos within this `README`
 - Added an experimental `WHITE` option to `LeviColorFilter`
 - Cleaned up detectors and filters

**2018.1**:
 - Added `HSVRangeFilter` that uses classic `lower` and `upper` HSV ranges
 - `HSVColorFilter` now devides the range by 2 on each side of the perfect color value. (Now range acts as expected) (Issue #9)
 - Added `SilverDetector` (Same as Gold but for silver)
 - Moved `SamplingOrderDetector` to use `HSVRangeFilter` for silver
 - Tuned Sampling (Still not competition ready)
 - Cleaned up `Dogeforia` handling per suggestions of "@BillTheCat123 | Mentor | 3763" on FTC Discord
 - Fixed Gradle import issues of `:FTCRobotController` with `Dogeforia` class. (Issue #8)
 - Cleaned up Gradle Build files to lessen import errors
 - Added common Gradle Build errors to wiki
 - `DogeCVDetector` now handles printing the detector setting to the screen

**2018.0**:
 - New Versioning System
 - New Scoring API
 - New DogeCVDetector Class
 - Vuforia Support
 - Gold Align, Mineral Order, and Gold Detectors
 - General Code Cleanup
 - Cleaner Params
 - Moved Downscaling to DogeCVDetector Class
 - Updated to EnderCV 2.0 (Modfied)
=======
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;https://github.com/ftctechnh/ftc_app/wiki

Note that the wiki is an "evergreen" document that is constantly being updated and edited.  It contains the most current information about the *FIRST* Tech Challenge software and control system.

## Downloading the Project
It is important to note that this repository is large and can take a long time and use a lot of space to download. If you would like to save time and space, there are some options that you can choose to download only the most current version of the Android project folder:

* If you are a git user, *FIRST* recommends that you use the --depth command line argument to only clone the most current version of the repository:

<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;git clone --depth=1 https://github.com/ftctechnh/ftc_app.git</p>

* Or, if you prefer, you can use the "Download Zip" button available through the main repository page.  Downloading the project as a .ZIP file will keep the size of the download manageable.

* You can also download the project folder (as a .zip or .tar.gz archive file) from the Downloads subsection of the Releases page for this repository.

Once you have downloaded and uncompressed (if needed) your folder, you can use Android Studio to import the folder  ("Import project (Eclipse ADT, Gradle, etc.)").

## Getting Help
### User Documentation and Tutorials
*FIRST* maintains an online wiki with information and tutorials on how to use the *FIRST* Tech Challenge software and robot control system.  You can access the wiki at the following address:

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;https://github.com/ftctechnh/ftc_app/wiki

### Javadoc Reference Material
The Javadoc reference documentation for the FTC SDK is now available online.  Visit the following URL to view the FTC SDK documentation as a live website:

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;http://ftctechnh.github.io/ftc_app/doc/javadoc/index.html    

Documentation for the FTC SDK is also included with this repository.  There is a subfolder called "doc" which contains several subfolders:

 * The folder "apk" contains the .apk files for the FTC Driver Station and FTC Robot Controller apps.
 * The folder "javadoc" contains the JavaDoc user documentation for the FTC SDK.

### Online User Forum
For technical questions regarding the SDK, please visit the FTC Technology forum:

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;http://ftcforum.usfirst.org/forumdisplay.php?156-FTC-Technology

**************************************************************************************
# Release Information
**************************************************************************************

Version 4.3 (built on 18.10.31)
 * Includes missing TensorFlow-related libraries and files.

**************************************************************************************
# Release Information
**************************************************************************************

Version 4.2 (built on 18.10.30)
 * Includes fix to avoid deadlock situation with WatchdogMonitor which could result in USB communication errors.
     - Comm error appeared to require that user disconnect USB cable and restart the Robot Controller app to recover.
     - robotControllerLog.txt would have error messages that included the words "E RobotCore: lynx xmit lock: #### abandoning lock:"
 * Includes fix to correctly list the parent module address for a REV Robotics Expansion Hub in a configuration (.xml) file.
     - Bug in versions 4.0 and 4.1 would incorrect list the address module for a parent REV Robotics device as "1".
     - If the parent module had a higher address value than the daisy-chained module, then this bug would prevent the Robot Controller from communicating with the downstream Expansion Hub.
 * Added requirement for ACCESS_COARSE_LOCATION to allow a Driver Station running Android Oreo to scan for Wi-Fi Direct devices.
 * Added google() repo to build.gradle because aapt2 must be downloaded from the google() repository beginning with version 3.2 of the Android Gradle Plugin.
     - Important Note: Android Studio users will need to be connected to the Internet the first time build the ftc_app project.
     - Internet connectivity is required for the first build so the appropriate files can be downloaded from the Google repository.
     - Users should not need to be connected to the Internet for subsequent builds.
     - This should also fix buid issue where Android Studio would complain that it "Could not find com.android.tools.lint:lint-gradle:26.1.4" (or similar).
 * Added support for REV Spark Mini motor controller as part of the configuration menu for a servo/PWM port on the REV Expansion Hub.
 * Provide examples for playing audio files in an Op Mode.
 * Block Development Tool Changes
     - Includes a fix for a problem with the Velocity blocks that were reported in the FTC Technology forum (Blocks Programming subforum).
     - Change the "Save completed successfully." message to a white color so it will contrast with a green background.
     - Fixed the "Download image" feature so it will work if there are text blocks in the op mode.    
 * Introduce support for Google's TensorFlow Lite technology for object detetion for 2018-2019 game.
     - TensorFlow lite can recognize Gold Mineral and Silver Mineral from 2018-2019 game.
     - Example Java and Block op modes are included to show how to determine the relative position of the gold block (left, center, right).

**************************************************************************************
# Release Information
**************************************************************************************

Version 4.1 (released on 18.09.24)

Changes include:
 * Fix to prevent crash when deprecated configuration annotations are used.
 * Change to allow FTC Robot Controller APK to be auto-updated using FIRST Global Control Hub update scripts.
 * Removed samples for non supported / non legal hardware.
 * Improvements to Telemetry.addData block with "text" socket.
 * Updated Blocks sample op mode list to include Rover Ruckus Vuforia example.
 * Update SDK library version number.
     
**************************************************************************************
# Release Information
**************************************************************************************

Version 4.0 (released on 18.09.12)

Changes include:
 * Initial support for UVC compatible cameras 
    - If UVC camera has a unique serial number, RC will detect and enumerate by serial number.
    - If UVC camera lacks a unique serial number, RC will only support one camera of that type connected.
    - Calibration settings for a few cameras are included (see TeamCode/src/main/res/xml/teamwebcamcalibrations.xml for details).
    - User can upload calibration files from Program and Manage web interface.
    - UVC cameras seem to draw a fair amount of electrical current from the USB bus.
         + This does not appear to present any problems for the REV Robotics Control Hub.
	 + This does seem to create stability problems when using some cameras with an Android phone-based Robot Controller.
	 + FTC Tech Team is investigating options to mitigate this issue with the phone-based Robot Controllers.
    - Updated sample Vuforia Navigation and VuMark Op Modes to demonstrate how to use an internal phone-based camera and an external UVC webcam.    

 * Support for improved motor control.
    - REV Robotics Expansion Hub firmware 1.8 and greater will support a feed forward mechanism for closed loop motor control.
    - FTC SDK has been modified to support PIDF coefficients (proportional, integral, derivative, and feed forward).
    - FTC Blocks development tool modified to include PIDF programming blocks.
    - Deprecated older PID-related methods and variables.
    - REV's 1.8.x PIDF-related changes provide a more linear and accurate way to control a motor.

 * Wireless
    - Added 5GHz support for wireless channel changing for those devices that support it.
        + Tested with Moto G5 and E4 phones.
	+ Also tested with other (currently non-approved) phones such as Samsung Galaxy S8.

* Improved Expansion Hub firmware update support in Robot Controller app
    - Changes to make the system more robust during the firmware update process (when performed through Robot Controller app).
    - User no longer has to disconnect a downstream daisy-chained Expansion Hub when updating an Expansion Hub's firmware.
        + If user is updating an Expansion Hub's firmware through a USB connection, he/she does not have to disconnect RS485 connection to other Expansion Hubs.
	+ The user still must use a USB connection to update an Expansion Hub's firmware.
	+ The user cannot update the Expansion Hub firmware for a downstream device that is daisy chained through an RS485 connection.
    - If an Expansion Hub accidentally gets "bricked" the Robot Controller app is now more likely to recognize the Hub when it scans the USB bus.
        + Robot Controller app should be able to detect an Expansion Hub, even if it accidentally was bricked in a previous update attempt.
	+ Robot Controller app should be able to install the firmware onto the Hub, even if if accidentally was bricked in a previous update attempt.
>>>>>>> 1df279274ca16aa67ec2b502bafe6eeab3bede7a
 
**1.1.1 HOTFIX**:
 - Fixed Jewel Detector Blue Filter
 

**1.1**:
- New Color Filter API   
- New Generic Detector     
- Fixed Jewel Debug Scores    
- Fixed Imports for DogeLogger inside Cryptobox Detector   
- Ported all detectors to Color Filter API     
- Added Yellow to LeviColorFilter
- Added HSV color filter
- New Relic/Generic Example
 
**1.0**:
 - New Cryptobox Detector
 - YouTube Tutorials
 - Per-Detector Documentation
 - Wiki Start 
 - Added `perfectRatio` tuning for Jewels
 - Optimization
 - Removed Multiple Mat returning

**0.5**:
 - Fixed rotated preview on protrait mode.
 - Detectors return an array of images. You can cycle through them by tapping on the preview screen
## Contact
If you have any suggestions or questions feel free to contact us at:    
**VictoryForPhil@gmail.com**
or 
**VictoryForPhil#4759 or Levi -12897** on Discord

You can also usually spot us on the FTC Discord.
