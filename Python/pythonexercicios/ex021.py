# Exercício Python 21: Faça um programa em Python
# que abra e reproduza o áudio de um arquivo MP3.
import pygame
pygame.mixer.init()
pygame.mixer.music.load('ex021.mp3')
pygame.mixer.music.play()
pygame.mixer.music.set_volume(1)
x = input('Digite algo para encerrar ...')
