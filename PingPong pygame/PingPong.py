import pygame
import random

pygame.init()

clock=pygame.time.Clock()
speed=100

d_w= 750
d_h= 500

x=250
y=178
radius=10
dx=4
dy=4

paddle_x=10
paddle_y=10
paddle_h=100
paddle_w=3

total_score=0
score_flag=0
cpaddle_x=d_w-10
#cpaddle_y=d_h-10

display=pygame.display.set_mode((d_w,d_h))

pygame.display.set_caption("Ping Pong!")

def sign():
        for x in range(230):
                display.fill((0,0,0))
                sign_font=pygame.font.Font(None,25)
                signature=sign_font.render("*** Created by: NITIN DAS ***",True,(255,255,255))
                signature_rect=signature.get_rect(center=(int(d_w/2),int(d_h/2)))
                display.blit(signature,signature_rect)
                pygame.display.flip()
        return None
def hit_back():
        if x+radius>d_w - 10:
                return True
        return False

def hit_sides():
        if y-radius<0:
                return True
        if y+radius > d_h:
                return True
        return False
def hit_paddle():
        global total_score
        global score_flag
        
        if x-radius <=paddle_x + paddle_w and y>=paddle_y and y<=paddle_y+paddle_h :
                if (not score_flag):
                        total_score+=10
                        score_flag=1
                return True
        return False
def game_over():
        end_game=True
        font_title=pygame.font.Font(None,36)
        font_instructions=pygame.font.Font(None,24)

        announcement = font_title.render("GAME OVER",True,(255,255,255))
        announcement_rect=announcement.get_rect(center=(int(d_w/2),int(d_h/2)))
        display.blit(announcement,announcement_rect)

        sinstructions= font_instructions.render("TOTAL SCORE : "+str(total_score),True,(255,255,255))
        sinstructions_rect=sinstructions.get_rect(center=(int(d_w/2),int(d_h/1.77)))
        display.blit(sinstructions,sinstructions_rect)

        qinstructions= font_instructions.render("Press q to quit the game",True,(255,255,255))
        qinstructions_rect=qinstructions.get_rect(center=(int(d_w/2),int(d_h/1.5)))
        display.blit(qinstructions,qinstructions_rect)

        rinstructions = font_instructions.render("Press r to play agin",True,(255,255,255))
        rinstructions_rect=rinstructions.get_rect(center=(int(d_w/2),int(d_h/1.36)))
        display.blit(rinstructions,rinstructions_rect)
        pygame.display.flip()
        while(end_game):
                for event in pygame.event.get():
                        if event.type == pygame.QUIT:
                                pygame.quit()
                                quit()
                        if event.type == pygame.KEYDOWN:
                                if event.key==pygame.K_q:
                                        sign()
                                        exit()
                                if event.key==pygame.K_r or event.key==pygame.K_UP:
                                        end_game=False

display.fill((0,0,0))
welcome_screen=pygame.font.Font(None,30)
welcome=welcome_screen.render("PING PONG",True,(255,255,255))
welcome_rect=welcome.get_rect(center=(int(d_w/2),int(d_h/2)))
display.blit(welcome,welcome_rect)
startmsg=welcome_screen.render("Press y to start",True,(255,255,255))
startmsg_rect=startmsg.get_rect(center=(int(d_w/2),int(d_h/1.43)))
display.blit(startmsg,startmsg_rect)
pygame.display.flip()

start=False
while(not start):
        for event in pygame.event.get():
                if event.type == pygame.KEYDOWN:
                        if event.key==pygame.K_y:
                                sign()
                                start=True
                                



while True:
        clock.tick(speed)
        display.fill((0,0,0))

        pressed_key=pygame.key.get_pressed()
        if pressed_key[pygame.K_DOWN] and paddle_y+paddle_h+10 <=d_h:
                paddle_y+=7.7
        if pressed_key[pygame.K_UP] and paddle_y>=10:
                paddle_y-=7

        for event in pygame.event.get():
                if event.type==pygame.QUIT:
                        pygame.quit()

        x+=dx
        y+=dy
        
        pygame.draw.rect(display,(255,255,255),(paddle_x,paddle_y,paddle_w,paddle_h))

        pygame.draw.rect(display,(255,255,255),(cpaddle_x,y-30,paddle_w,paddle_h))
	
        pygame.draw.circle(display,(255,255,255),(x,y),radius)

        font_instructions=pygame.font.Font(None,30)
        sinstructions= font_instructions.render(str(total_score),True,(255,255,255))
        sinstructions_rect=sinstructions.get_rect(center=(int(d_w/2),20))
        display.blit(sinstructions,sinstructions_rect)

        if not hit_paddle():
                score_flag=0
        if hit_back() or hit_paddle():      
                dx*=-1
                speed+=0.3
        if hit_sides():
                dy*=-1
        if x<radius:
                #print("GameOVER")
                game_over()
                x=250
                y=250
                dx=abs(dx)
                total_score=0
                speed=100
                
        pygame.display.update() 
