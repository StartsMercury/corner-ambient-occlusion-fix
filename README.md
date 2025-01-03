# Corner Ambient Occlusion Fix

Fixes ambient occlusion when on surface corners as observed in Cosmic Reach
`0.1.43`.

| Fix (Mod Installed) | Issue (Cosmic Reach as of 0.1.43) |
|:-------------------:|:---------------------------------:|
| ![exhibit-with-mod] |      ![exhibit-without-mod]       |

[exhibit-with-mod]: assets/exhibit-with-mod.png
[exhibit-without-mod]: assets/exhibit-without-mod.png

## Downloads

Corner Ambient Occlusion Fix is only officially available on CRMM and GitHub. All
published version of this mod are both in
[CRMM](https://www.crmm.tech/mod/corner-ambient-occlusion-fix/versions) and [GitHub Releases](https://github.com/StartsMercury/corner-ambient-occlusion-fix/releases):

> * <https://www.crmm.tech/mod/corner-ambient-occlusion-fix/versions>
> * <https://github.com/StartsMercury/corner-ambient-occlusion-fix/releases>

---

This repository is generated from
https://codeberg.org/CRModders/cosmic-quilt-example.

## Wiki

For a wiki on how to use Cosmic Quilt & Quilt, please look at the [Cosmic Quilt
wiki] .

## How to test/build

For testing in the developer environment, you can use the `./gradlew run` task

For building, the usual `./gradlew build` task can be used. The mod jars will be
in the `build/libs/` folder

## Notes
- Most project properties can be changed in the <tt>[gradle.properties]</tt>
- To change author, description and stuff that is not there, edit <tt>[src/main/resources/quilt.mod.json]</tt>
- The project name is defined in <tt>[settings.gradle.kts]</tt>
- To add Quilt mods in the build, make sure to use `internal` rather than `implementation`

[src/main/resources/quilt.mod.json]: src/main/resources/quilt.mod.json
[gradle.properties]: gradle.properties
[settings.gradle.kts]: settings.gradle.kts

[Cosmic Quilt wiki]: https://codeberg.org/CRModders/cosmic-quilt/wiki
