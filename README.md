# Minecraft Mod Project - 1.20.1

This is the source code for a Minecraft mod I'm currently developing for version **1.20.1**.

I created this project using Forge. The base structure (the skeleton of the project) was taken straight from the official **Forge Mdk**. If you're looking to build your own mod from scratch, you can find the Mdk here: [Minecraft Forge 1.20.1 Downloads](https://files.minecraftforge.net/net/minecraftforge/forge/index_1.20.1.html) (just click on the **Mdk** button to download it).

## How to run it locally

If you want to test the mod, the process is pretty straightforward. I use Gradle to manage the build.

1. Make sure you have **Java** installed.
2. Clone or download this repository to your machine.
3. Open a terminal in the project folder and run the command below to launch the game directly from the development environment:

```console
.\gradlew runClient
```

The first run might take a little while because Gradle needs to download all the necessary assets and dependencies for Minecraft and Forge. Once it's done, a Minecraft instance will automatically pop up with the mod already loaded and ready for testing!

### The Magic Wand

The core feature of this mod is the **Magic Wand (Bagheta Magica)**. When used, it unleashes a massive, explosive fireball that you can launch at enemies, terrain, or whatever else gets in your way. It's the perfect tool if you want to add a bit of chaotic magic to your Minecraft world!
