package br.com.alura.forum.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.alura.forum.controller.dto.TopicoDto;
import br.com.alura.forum.modelo.Topico;
import br.com.alura.forum.repository.TopicoRepository;

@Service
public class TopicosService {

	@Autowired
	private TopicoRepository topicoRepository;

	public List<TopicoDto> lista(String nomeTopico) {
		if (nomeTopico == null) {
			List<Topico> topicos = topicoRepository.findAll();
			return TopicoDto.converter(topicos);
		} else {
			List<Topico> topicos = topicoRepository.findByTituloContains(nomeTopico);
			return TopicoDto.converter(topicos);
		}
	}
}
