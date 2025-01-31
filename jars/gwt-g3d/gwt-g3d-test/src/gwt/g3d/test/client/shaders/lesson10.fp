#ifdef GL_ES
precision highp float;
#endif
varying vec2 vTextureCoord;
 
uniform sampler2D uSampler;
 
void main(void) {
  gl_FragColor = texture2D(uSampler, vec2(vTextureCoord.s, 1.0 - vTextureCoord.t));
}