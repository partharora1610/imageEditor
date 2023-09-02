# How this works

This project currently works in terminal only, and it accepts image path from the user and finds the image in the folder and based on the user input manipulates the image and returns the image in the output folder in the same project.

**The features include:**

1. Brightness
1. Contrast
1. Horizontal Flip
1. Vertical Flip
1. Rotate 90 degrees anti-clockwise
1. Gray Scale
1. Blur (Copied this and will implement this later on my own)

## How to use this project

Add any image of your choice in the assets folder and then run the application in the terminal to edit the image.

### New Things I learned in this project

- Learned how to handle bufferedImages.
- Learned to work with ImageIO package.
- Learned how to manipulate images based on the input taken entered by the user.
- Learned how to work with multiple classes in Java.

### Features this project supports

This class contains all the filters that can be applied on the image. It has a filter method which takes in the image and the filter to be applied on the image. It then applies the filter on the image and returns the result image.

**Brightness**: This filter takes in the image and the brightness value. It then applies the brightness filter on the image and returns the result image. The brightness filter is applied by adding the brightness value to each pixel value of the image.

**Contrast**: This filter takes in the image and the contrast value. It then applies the contrast filter on the image and returns the result image. The contrast filter is applied by multiplying the contrast value to each pixel value of the image.

**Horizontal Flip**: This filter takes in the image. It then applies the horizontal flip filter on the image and returns the result image. The horizontal flip filter is applied by reversing the order of the pixels in each row of the image.

**Vertical Flip**: This filter takes in the image. It then applies the vertical flip filter on the image and returns the result image. The vertical flip filter is applied by reversing the order of the rows of the image.

**Rotate 90 degrees clockwise**: This filter takes in the image. It then applies the rotate 90 degrees clockwise filter on the image and returns the result image. The rotate 90 degrees clockwise filter is applied by reversing the order of the rows of the image and then reversing the order of the pixels in each row of the image.

**Gray Scale**: This filter takes in the image. It then applies the gray scale filter on the image and returns the result image. The gray scale filter is applied by taking the average of the red, green and blue values of each pixel and then setting the red, green and blue values of each pixel to the average value.

**Blur**: This feature is not implemented right now by my own, I copied this and later I will understand this and implement this on my own.

## Features that I will implement in the future

- Implement GUI using JavaFx.
- Implement blur filter.
